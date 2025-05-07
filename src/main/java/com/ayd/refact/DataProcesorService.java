package com.ayd.refact;

import java.util.ArrayList;
import java.util.List;

public class DataProcesorService {

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
}
