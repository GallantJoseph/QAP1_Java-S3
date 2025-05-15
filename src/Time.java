/*
    Description: QAP 1 - Problem 3 - Time Class
    Author: Joseph Gallant
    Dates: May 15, 2025
 */

public class Time {
    // Private attributes declaration
    private int hour;
    private int minute;
    private int second;

    // Constructors
    // Parameterized
    public Time (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters
    public int getHour () {
        return hour;
    }

    public int getMinute () {
        return minute;
    }

    public int getSecond () {
        return second;
    }

    // Setters
    public void setHour (int hour) {
        this.hour = hour;
    }

    public void setMinute (int minute) {
        this.minute = minute;
    }

    public void setSecond (int second) {
        this.second = second;
    }

    // Set the time
    public void setTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // toString method overload. Returns the formatted time in "hh:mm:ss" format.
    // Includes the leading zero
    public String toString () {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Advances the time by one second and returns the current instance
    public Time nextSecond () {
        this.second += 1;
        return this;
    }

    // Removes one second and returns the current instance
    public Time previousSecond () {
        this.second -= 1;
        return this;
    }
}
