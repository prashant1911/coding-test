/**
 * 
 */
package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.monsanto.mbt.util.SortType;
import com.monsanto.mbt.util.WidgetColorComparator;
import com.monsanto.mbt.util.WidgetDateComparator;

/**
 * @author prash
 *
 */
public class ShipmentHelper {

	public List<Widget> sortShipment(List<Widget> widgetList, SortType sortType) {

		if (widgetList.isEmpty()) {
			return widgetList;
		}

		List<Widget> sortedWidgetList = new ArrayList<Widget>(widgetList);

		// Sort widget list based on requirement

		if (sortType != null) {
			switch (sortType) {
			case COLOR:
				Collections.sort(sortedWidgetList, new WidgetColorComparator());
				break;
			case DATE:
				Collections.sort(sortedWidgetList, new WidgetDateComparator());
				break;
			default:
			}
		}

		return sortedWidgetList;
	}

	public List<Shipment> createShipment(List<Widget> input) {

		if (input.isEmpty()) {
			return null;
		}

		List<Shipment> shipments = new ArrayList<Shipment>();
		int numberOfShipments = 0;

		if (input.size() > 10) {
			numberOfShipments = input.size() % 10;
		} else {
			numberOfShipments = 1;
		}

		/********************Create Shipment***********************/

		
		if (numberOfShipments == 1) { // If number of shipment is 1
			Shipment s = new Shipment();
			s.setShipment(input);
			shipments.add(s);
		} else { // If number of shipments are greater than 10
			int endIndex = input.size();
			int startIndex = 0;

			for (int i = 1; i <= numberOfShipments; i++) {
				Shipment s = new Shipment();
				s.setShipment(input.subList(startIndex, (10 * i) > endIndex ? endIndex : 10 * i));
				shipments.add(s);
				startIndex = startIndex + 10;
			}
		}

		return shipments;
	}

}
