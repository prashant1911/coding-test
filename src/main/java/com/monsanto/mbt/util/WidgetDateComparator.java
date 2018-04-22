/**
 * 
 */
package com.monsanto.mbt.util;

import java.util.Comparator;

import com.monsanto.mbt.Widget;

/**
 * @author prash
 *
 */
public class WidgetDateComparator implements Comparator<Widget> {

	
	@Override
	public int compare(Widget thisWidget, Widget thatWidget) {

		if (thisWidget.getProductionDate().before(thatWidget.getProductionDate())) {
			return -1;
		} else if (thisWidget.getProductionDate().after(thatWidget.getProductionDate())) {
			return 1;
		} else {
			return 0;
		}
	}

}
