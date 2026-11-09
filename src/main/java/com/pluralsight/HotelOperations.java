package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        Room room1 = new Room(2, 139.00, false, true, false);
        System.out.println("Room availability: " + room1.isAvailable());

        System.out.println("Housekeeping is cleaning room 1...");
        room1.setDirty(false);
        System.out.println("Room availability: " + room1.isAvailable());
    }
}
