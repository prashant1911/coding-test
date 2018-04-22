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
public class WidgetColorComparator implements Comparator<Widget> {

	public int compare(Widget thisWidget, Widget thatWidget) {		
		return thisWidget.getColor().compareTo(thatWidget.getColor());
	}

}
