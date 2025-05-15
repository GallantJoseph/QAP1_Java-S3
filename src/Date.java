/*
    Description: QAP 1 - Problem 2 - Date Class
    Author: Joseph Gallant
    Dates: May 15, 2025
 */

public class Date {
    // Private attributes declaration
    private int day;
    private int month;
    private int year;

    // Constructors
    // Parameterized
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Set the entire date
    public void setDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // toString method overload. Returns a formatted date in "dd/mm/yyyy" format.
    // Includes the leading zero
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }
}
