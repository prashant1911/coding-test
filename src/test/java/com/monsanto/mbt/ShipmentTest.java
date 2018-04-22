package com.monsanto.mbt;


import org.junit.Test;

import com.monsanto.mbt.util.SortType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class ShipmentTest {

	ShipmentHelper shipmentHelper = new ShipmentHelper();
	
    @Test
	public void testShipment_Sorted_By_Color() {

		List<Widget> result = shipmentHelper.sortShipment(WidgetUtils.getSampleWidgets(), SortType.COLOR);

		assertEquals("Blue", result.get(0).getColor());
		assertEquals("Blue", result.get(1).getColor());
		assertEquals("Blue", result.get(2).getColor());
		assertEquals("Blue", result.get(3).getColor());
		assertEquals("Blue", result.get(4).getColor());
		assertEquals("Blue", result.get(5).getColor());
	//	assertEquals("Blue", result.get(6).getColor());
		assertEquals("Green", result.get(6).getColor());
		assertEquals("Green", result.get(6).getColor());
	}

    @Test
    public void testShipment_Sorted_By_Date(){
    
    	List<Widget> input = shipmentHelper.sortShipment(WidgetUtils.getSampleWidgets(), SortType.DATE);
    	for (int i = 0; i < WidgetUtils.getSampleWidgets().size() - 1; i++) {
    	        int j = i + 1;
    	       assertTrue(input.get(i).getProductionDate().compareTo(input.get(j).getProductionDate()) <= 0);  
    	 } 

    }


}
