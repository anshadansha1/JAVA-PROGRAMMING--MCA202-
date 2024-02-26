
public class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}

/////
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
/////
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.io.*;

public class HotelManagementService {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_hotel?characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private List<Room> rooms;
    private List<Reservation> reservations;
    private int nextReservationId;

    

    public HotelManagementService() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
        nextReservationId = 1;
        initializeRooms(10); // Initialize 10 rooms
    }

    private void initializeRooms(int numberOfRooms) {
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void addReservation(String guestName, int numberOfGuests) {
        
        try {
            Class.forName("comm.mysql.jdbc.Driver");//loads the MySQL JDBC (Java Database Connectivity) driver class into memory
            Connection con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            PreparedStatement st = con.prepareStatement("INSERT INTO reservations (room_number, guest_name, number_of_guests) VALUES (?, ?, ?)");
            Room availableRoom = findAvailableRoom();
            if (availableRoom != null) {
                st.setInt(1, availableRoom.getRoomNumber());
                st.setString(2, guestName);
                st.setInt(3, numberOfGuests);
                st.executeUpdate();
                availableRoom.setBooked(true);
                Reservation reservation = new Reservation(nextReservationId++, availableRoom, guestName, numberOfGuests);
                reservations.add(reservation);
                System.out.println("Reservation successful! Reservation ID: " + reservation.getReservationId());
            } else {
                System.out.println("Sorry, no available rooms for reservation.");
            }
        } catch (Exception e) {
            System.out.println("\nError : "+e);
        }
    //     Room availableRoom = findAvailableRoom(); //finds the available room
    //     if (availableRoom != null) {
    //         Reservation reservation = new Reservation(nextReservationId++, availableRoom, guestName, numberOfGuests);
    //         availableRoom.setBooked(true);
    //         reservations.add(reservation);
    //         System.out.println("Reservation successful! Reservation ID: " + reservation.getReservationId());
    //     } else {
    //         System.out.println("Sorry, no available rooms for reservation.");
    //     }
    // }

    // private Room findAvailableRoom() {
    //     for (Room room : rooms) { //iterates over each "Room" object in the "rooms" list.
    //         if (!room.isBooked()) { //when value of isBooked is false i.e when there is unbooked rooms.
    //             return room;
    //         }
    //     }
    //     return null;
    }

    public void cancelReservation(int reservationId) {

        try {
            Class.forName("comm.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement("DELETE FROM reservations WHERE reservation_id = ?");
            Reservation reservationToRemove = null;
            for (Reservation reservation : reservations) {
                if (reservation.getReservationId() == reservationId) {
                    reservationToRemove = reservation;
                    reservation.getRoom().setBooked(false);
                    break;
                }
            }
            if (reservationToRemove != null) {
                reservations.remove(reservationToRemove);
                statement.setInt(1, reservationId);
                statement.executeUpdate();
                System.out.println("Reservation with ID " + reservationId + " canceled successfully.");
            } else {
                System.out.println("Reservation with ID " + reservationId + " not found.");
            }
        } catch (Exception e) {
            System.out.println("\nError : "+e);
        }
        // Reservation reservationToRemove = null;
        // for (Reservation reservation : reservations) { //iterates over each "Reservation" object in the "reservations" list.
        //     if (reservation.getReservationId() == reservationId) {
        //         reservationToRemove = reservation;
        //         reservation.getRoom().setBooked(false); //the room associated with a particular reservation is being marked as unbooked(cancelled)
        //         break;
        //     }
        // }
        // if (reservationToRemove != null) {
        //     reservations.remove(reservationToRemove);
        //     System.out.println("Reservation with ID " + reservationId + " canceled successfully.");
        // } else {
        //     System.out.println("Reservation with ID " + reservationId + " not found.");
        // }
    }

    public void displayAvailableRooms() {
        try {
            Class.forName("comm.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM rooms WHERE is_booked = false");
            System.out.println("Available Rooms:");
            while (resultSet.next()) {
                int roomNumber = resultSet.getInt("room_number");
                System.out.println("Room Number: " + roomNumber);
            }
        } catch (Exception e) {
            System.out.println("\nError : "+e);
        }
        // System.out.println("Available Rooms:");
        // for (Room room : rooms) {
        //     if (!room.isBooked()) { 
        //         System.out.println("Room Number: " + room.getRoomNumber());
        //     }
        // }
    }

    //To display Reserved Rooms
    public void displayAllReservations() {
        try {
            Class.forName("comm.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM reservations");
            System.out.println("\nDisplaying All Reservations -->");
            while (resultSet.next()) {
                int reservationId = resultSet.getInt("reservation_id");
                int roomNumber = resultSet.getInt("room_number");
                String guestName = resultSet.getString("guest_name");
                int numberOfGuests = resultSet.getInt("number_of_guests");
                System.out.println("Reservation ID: " + reservationId +
                        ", Guest Name: " + guestName +
                        ", Room Number: " + roomNumber +
                        ", Number of Guests: " + numberOfGuests);
            }
        } catch (Exception e) {
            System.out.println("\nError : "+e);
        }

        // System.out.println("\nDisplaying All Reservations -->");
        // for (Reservation reservation : reservations) {
        //     System.out.println("Reservation ID: " + reservation.getReservationId() +
        //             ", Guest Name: " + reservation.getGuestName() +
        //             ", Room Number: " + reservation.getRoom().getRoomNumber() +
        //             ", Number of Guests: " + reservation.getNumberOfGuests());
        // }
    }

    private Room findAvailableRoom() {
        for (Room room : rooms) {
            if (!room.isBooked()) {
                return room;
            }
        }
        return null;
    }
}

/////

/////

/////