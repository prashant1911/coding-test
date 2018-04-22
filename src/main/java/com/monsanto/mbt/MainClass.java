/**
 * 
 */
package com.monsanto.mbt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * @author prash
 *
 */
public class MainClass {

	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");  
	/**
	 * @param args
	 * @throws ParseException 
	 */
	
	public static void main(String[] args) throws ParseException {
		List<Widget> widgetList = new ArrayList<Widget>();
		widgetList.add(new Widget(1,"Red", DATE_FORMAT.parse("1/1/2006")));
		widgetList.add(new Widget(2,"Blue", DATE_FORMAT.parse("1/1/2004")));
		widgetList.add(new Widget(3,"Green", DATE_FORMAT.parse("1/1/2009")));
		widgetList.add(new Widget(4,"Red", DATE_FORMAT.parse("1/1/2007")));
		widgetList.add(new Widget(5,"Red", DATE_FORMAT.parse("1/1/2006")));
		widgetList.add(new Widget(6,"Blue", DATE_FORMAT.parse("1/1/2004")));
		widgetList.add(new Widget(7,"Green", DATE_FORMAT.parse("1/1/2009")));
		widgetList.add(new Widget(8,"Red", DATE_FORMAT.parse("1/1/2007")));
		widgetList.add(new Widget(9,"Red", DATE_FORMAT.parse("1/1/2006")));
		widgetList.add(new Widget(10,"Blue", DATE_FORMAT.parse("1/1/2004")));
		widgetList.add(new Widget(11,"Green", DATE_FORMAT.parse("1/1/2009")));
		widgetList.add(new Widget(12,"Red", DATE_FORMAT.parse("1/1/2007")));

		
		ShipmentHelper creator = new ShipmentHelper();
		try {
			List<Shipment> shipments = creator.createShipment(widgetList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//System.out.println(shipments);

	}

}
