package com.ayd.noRefact;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.ayd.noRefact.FinalExample.Order;
import com.ayd.noRefact.FinalExample.ReportGenerator;

public class FinalExampleTest {

    private final String testString = "hola,como,estas";

    private final FinalExample finalExample = new FinalExample();
    private final ReportGenerator reportGenerator = finalExample.new ReportGenerator();
    private final Order order = finalExample.new Order();

    private final String USER_NAME = "luis";
    private final String USER_EMAIL = "email@c";
    private final String USER_PHONE = "4123333";

    private final String ADDRES = "add";
    private final String CITY = "city";
    private final String ZIP = "ZIP";

    private final String SHAPE_CIRCLE = "circle";

    private final String SHAPE_RECTANGLE = "rectangle";
    private final String SHAPE_TRIANGLE = "triangle";
    private final double CIRCLE_DIMENSION_1 = 1.0;

    @Test
    public void testProcessData() {

        String expected = String.join("\n",
                "Data processed:",
                "- HOLA",
                "- COMO",
                "- ESTAS",
                "Total items:",
                "- HOLA",
                "- COMO",
                "- ESTAS");

        String result = finalExample.processData(testString);

        assertEquals(expected, result);
    }

    @Test
    public void testcreateUserSuccess() {

        // arrange
        // ...
        String expected = "User created: " + USER_NAME;
        // ACT
        String result = this.finalExample.createUser(USER_NAME, USER_EMAIL, USER_PHONE, ADDRES, CITY, ZIP);
        // ASSERT
        assertEquals(expected, result);

    }

    @Test
    public void testcreateUserNameEmpty() {

        // arrange
        // ...
        String expected = "Name cannot be empty";
        // ACT
        String result = this.finalExample.createUser(null, USER_EMAIL, USER_PHONE, ADDRES, CITY, ZIP);
        // ASSERT
        assertEquals(expected, result);

    }

    @Test
    public void testcreateUserInvalidEmail() {

        // arrange
        // ...
        String expected = "Invalid email";
        // ACT
        String result = this.finalExample.createUser(USER_NAME, null, USER_PHONE, ADDRES, CITY, ZIP);
        // ASSERT
        assertEquals(expected, result);

    }

    @Test
    public void testcreateUserInvalidEmailWhitoutA() {

        // arrange
        // ...
        String expected = "Invalid email";
        // ACT
        String result = this.finalExample.createUser(USER_NAME, "x", USER_PHONE, ADDRES, CITY, ZIP);
        // ASSERT
        assertEquals(expected, result);

    }

    @Test
    public void testCalculateAreaCircle() {

        // arrange
        // ...
        double expected = Math.PI;
        // ACT
        double result = this.finalExample.calculateArea(SHAPE_CIRCLE, CIRCLE_DIMENSION_1);
        // ASSERT
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testCalculateAreaRectangle() {

        // arrange
        // ...
        double expected = 1;
        // ACT
        double result = this.finalExample.calculateArea(SHAPE_RECTANGLE, CIRCLE_DIMENSION_1, CIRCLE_DIMENSION_1);
        // ASSERT
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testCalculateAreaTriangle() {
        // arrange
        // ...
        double expected = 0.5;
        // ACT
        double result = this.finalExample.calculateArea(SHAPE_TRIANGLE, CIRCLE_DIMENSION_1, CIRCLE_DIMENSION_1);
        // ASSERT
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testCalculateInvalidOption() {

        // arrange
        // ...

        // ACT
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            finalExample.calculateArea("", CIRCLE_DIMENSION_1, CIRCLE_DIMENSION_1);
        });

        // ASSERT
        assertEquals("Unknown shape", exception.getMessage());
    }

    private final String CUSTOMER = "Luis";
    private final String ITEM = "X";
    private final double TOTAL = 1.1;

    @Test
    public void testPrintHeader() {

        // arrange
        String expected = "Order for: " + CUSTOMER;

        // ACT
        String result = this.reportGenerator.printHeader(CUSTOMER);
        // ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void testPrintLineItem() {

        // arrange
        String expected = " - Item: " + ITEM;

        // ACT
        String result = this.reportGenerator.printLineItem(ITEM);
        // ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void testPrintTotal() {

        // arrange
        String expected = "Total: $" + TOTAL;

        // ACT
        String result = this.reportGenerator.printTotal(TOTAL);
        // ASSERT
        assertEquals(expected, result);
    }
}
