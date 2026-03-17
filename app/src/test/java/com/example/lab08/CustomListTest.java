package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDelete() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);  // <-- IMPORTANT

        list.delete(calgary);
        assertFalse(list.hasCity(calgary));

    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        City lahore = new City("Lahore", "Punjab");
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.addCity(lahore);
        assertEquals(2, list.countCities());
    }

}
