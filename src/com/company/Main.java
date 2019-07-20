package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }


    public static void printYearsAndDays(long minutes) {
        if(minutes >= 0) {
            int day = 1440;
            int year = 525600;
            long minutesLeft = minutes;
            long computedYears = 0;
            long computedDays = 0;

            if(minutesLeft >= year) {
                computedYears = minutesLeft/year;
                minutesLeft = minutesLeft % year;
            }

            if(minutesLeft >= day) {
                computedDays = minutesLeft/day;
            }

            System.out.println(minutes + " min = " + computedYears + " y and " + computedDays + " d");
        } else {
            System.out.println("Invalid Value");
        }

    }
}
