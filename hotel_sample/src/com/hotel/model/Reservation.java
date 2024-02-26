
package com.hotel.model;

public class Reservation {
    private int reservationId;
    private Room room;
    private String guestName;
    private int numberOfGuests;

    public Reservation(int reservationId, Room room, String guestName, int numberOfGuests) {
        this.reservationId = reservationId;
        this.room = room;
        this.guestName = guestName;
        this.numberOfGuests = numberOfGuests;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Room getRoom() {
        return room;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}