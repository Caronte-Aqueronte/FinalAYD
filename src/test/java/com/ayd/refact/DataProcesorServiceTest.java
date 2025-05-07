package com.ayd.refact;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DataProcesorServiceTest {
    private final DataProcesorService dataProcesorService = new DataProcesorService();

    private final String TEST_STRING = "hola,como,estas";

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

        String result = dataProcesorService.processData(TEST_STRING);

        assertEquals(expected, result);
    }
}
