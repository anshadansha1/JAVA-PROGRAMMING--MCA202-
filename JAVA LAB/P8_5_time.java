/*PROGRAM 8_5 : 5Define a class called Time that has hours and minutes as integer. The class has the following member function: Time sum(Time) to sum two time object & return time a. Use the concept of constructor overloading to initialize the time 
    8.5.1 Write the definitions for each of the above member functions. 
    8.5.2 Write main function to create three time objects. 
        et the value in two objects and call sum() to calculate sum and assign it in third object. Display all time objects. (Use the concept of this pointer too) 

*/

import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;

    // Default constructor
    public Time() {
        this.hours = 0;
        this.minutes = 0;
    }

    // Parameterized constructor with hours and minutes
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Getter methods
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    // Setter methods
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    // Method to sum two Time objects
    public Time sum(Time other) {
        int totalHours = this.hours + other.getHours();
        int totalMinutes = this.minutes + other.getMinutes();

        // Adjust minutes if they exceed 60
        if (totalMinutes >= 60) {
            totalHours += totalMinutes / 60;
            totalMinutes %= 60;
        }

        return new Time(totalHours, totalMinutes);
    }

    // Method to display the time
    public void display() {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }
}

public class P8_5_time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating three time objects
        Time time1 = new Time();
        Time time2 = new Time();
        Time time3;

        // Taking input for time object 1
        System.out.println("Enter hours and minutes for time object 1:");
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        time1.setHours(hours1);
        time1.setMinutes(minutes1);

        // Taking input for time object 2
        System.out.println("Enter hours and minutes for time object 2:");
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        time2.setHours(hours2);
        time2.setMinutes(minutes2);

        // Calculating sum and assigning it to time object 3
        time3 = time1.sum(time2);

        // Displaying all time objects
        System.out.println("Time object 1:");
        time1.display();
        System.out.println("Time object 2:");
        time2.display();
        System.out.println("Sum of time object 1 and time object 2:");
        time3.display();

        scanner.close();
    }
}
