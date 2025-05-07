package com.ayd.refact;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReportGeneratorServiceTest {
    private final ReportGeneratorService reportGeneratorService = new ReportGeneratorService();

    private final String CUSTOMER = "Luis";
    private final String ITEM = "X";
    private final double TOTAL = 1.1;

    @Test
    public void testPrintHeader() {

        // arrange
        String expected = "Order for: " + CUSTOMER;

        // ACT
        String result = this.reportGeneratorService.printHeader(CUSTOMER);
        // ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void testPrintLineItem() {

        // arrange
        String expected = " - Item: " + ITEM;

        // ACT
        String result = this.reportGeneratorService.printLineItem(ITEM);
        // ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void testPrintTotal() {

        // arrange
        String expected = "Total: $" + TOTAL;

        // ACT
        String result = this.reportGeneratorService.printTotal(TOTAL);
        // ASSERT
        assertEquals(expected, result);
    }
}
