/*
    Description: QAP 1 - Problem 3 - TestTime Class
    Author: Joseph Gallant
    Dates: May 15, 2025
 */

public class TestTime {
    public static void main (String [] args) {
        // Create two Time objects
        Time t1 = new Time(0,0,0);
        Time t2 = new Time(0,0,0);

        // Using the setTime method to define the time values
        t1.setTime(21,10,15);

        // Using the "Setters" methods to define the time values
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // Print the times
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());

        // Change the second values using the previousSecond and nextSecond methods.
        t1 = t1.nextSecond();
        t2 = t2.previousSecond();

        // Print the new times
        System.out.println("\nTime after changes:");
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
    }
}
