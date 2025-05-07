package com.ayd.noRefact;

import java.util.ArrayList;
import java.util.List;

public class FinalExample {

    public String processData(String input) {
        String result = "";
        List<String> data = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            part = part.trim();
            if (part.length() > 0) {
                if (part.length() > 10) {
                    part = part.substring(0, 10);
                }
                if (part.matches("[a-zA-Z]+")) {
                    data.add(part.toUpperCase());
                }
            }
        }

        System.out.println("Data processed:");
        result += "Data processed:";
        for (String item : data) {
            System.out.println("- " + item);
            result += "\n- " + item;
        }

        System.out.println("Total items:");

        result += "\nTotal items:";
        for (String item : data) {
            System.out.println("- " + item);
            result += "\n- " + item;
        }

        return result;
    }

    public String createUser(String name, String email, String phone,
            String address, String city, String zip) {
        // Validation logic mixed with creation
        if (name == null || name.isEmpty()) {
            return "Name cannot be empty";
        }
        if (email == null || !email.contains("@")) {
            return "Invalid email";
        }
        // ... more validations

        return "User created: " + name;
    }

    public class Order {
        private String customerName;
        private List<String> items;
        private double total;

        public void printOrderSummary() {
            ReportGenerator generator = new ReportGenerator();
            generator.printHeader(customerName);
            for (String item : items) {
                generator.printLineItem(item);
            }
            generator.printTotal(total);
        }
    }

    public class ReportGenerator {
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

    public double calculateArea(String shape, double... dimensions) {
        switch (shape) {
            case "circle":
                return Math.PI * dimensions[0] * dimensions[0];
            case "rectangle":
                return dimensions[0] * dimensions[1];
            case "triangle":
                return dimensions[0] * dimensions[1] / 2;
            default:
                throw new IllegalArgumentException("Unknown shape");
        }
    }
}
