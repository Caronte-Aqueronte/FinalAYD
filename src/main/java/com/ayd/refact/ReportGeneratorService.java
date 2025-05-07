package com.ayd.refact;

public class ReportGeneratorService {

    public String printHeader(String customer) {
        System.out.println("Order for: " + customer);
        return "Order for: " + customer;
    }

    public String printLineItem(String item) {
        System.out.println(" - Item: " + item);
        return " - Item: " + item;
    }

    public String printTotal(double total) {
        System.out.println("Total: $" + total);
        return "Total: $" + total;
    }
}
