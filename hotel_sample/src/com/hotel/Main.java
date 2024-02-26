package com.hotel;

import com.hotel.service.HotelManagementService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HotelManagementService hotelService = new HotelManagementService(); //creating an instance of class HotelManagementService
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nHotel Management System Menu----->");
            System.out.println("1. Book a Room");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. View Available Rooms");
            System.out.println("4. View All Reservations");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    try {
                        System.out.print("\nEnter the guest name: ");
                        s.nextLine(); 
                        String guestName = s.nextLine();
                        System.out.print("Enter number of guests: ");
                        int numberOfGuests = s.nextInt();
                        hotelService.addReservation(guestName, numberOfGuests);
                        break;
                    } catch (Exception e) {
                        System.out.println("\nError : "+e);
                    }
                    
                case 2:
                    try {
                        System.out.print("\nEnter reservation ID to cancel: ");
                        int reservationId = s.nextInt();
                        hotelService.cancelReservation(reservationId);
                        break;
                    } catch (Exception e) {
                    System.out.println("\nError : "+e);
                    }
                    
                case 3:
                    hotelService.displayAvailableRooms();
                    break;
                case 4:
                    hotelService.displayAllReservations();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}