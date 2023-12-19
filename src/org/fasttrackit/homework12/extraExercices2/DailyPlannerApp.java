package org.fasttrackit.homework12.extraExercices2;


import org.fasttrackit.homework12.extraExercices1.DailyPlannerExtra;
import org.fasttrackit.homework12.extraExercices1.Day;
import org.fasttrackit.homework12.extraExercices1.NoActivitiesForDayException;
import org.fasttrackit.homework12.extraExercices1.NoActivityException;

import java.util.*;

public class DailyPlannerApp {
    private static DailyPlannerExtra planner = new DailyPlannerExtra();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addActivity();
                    break;
                case 2:
                    removeActivity();
                    break;
                case 3:
                    listAllActivities();
                    break;
                case 4:
                    endPlanning();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);
    }

    private static void displayMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1) Add an activity");
        System.out.println("2) Remove an activity");
        System.out.println("3) List all activities");
        System.out.println("4) End planning");
    }

    private static void addActivity() {
        System.out.print("Enter the day (MONDAY, TUESDAY, etc.): ");
        String dayInput = scanner.nextLine();
        Day day = Day.valueOf(dayInput.toUpperCase());

        System.out.print("Enter the activity: ");
        String activity = scanner.nextLine();

        try {
            planner.addActivity(day, activity);
            System.out.println("Activity added successfully for " + day + ".");
        } catch (NoActivityException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removeActivity() {
        System.out.print("Enter the day (MONDAY, TUESDAY, etc.): ");
        String dayInput = scanner.nextLine();
        Day day = Day.valueOf(dayInput.toUpperCase());

        System.out.print("Enter the activity to remove: ");
        String activity = scanner.nextLine();

        try {
            planner.removeActivity(day, activity);
            System.out.println("Activity removed successfully for " + day + ".");
        } catch (NoActivityException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void listAllActivities() {
        for (Day day : Day.values()) {
            List<String> activities = planner.getActivities(day);
            System.out.println(day + " activities: " + activities);
        }
    }

    private static void endPlanning() {
        try {
            Map<Day, List<String>> activities = planner.endPlanning();
            System.out.println("Planning ended successfully.");
            System.out.println("Activities for each day: " + activities);
        } catch (NoActivitiesForDayException e) {
            System.out.println(e.getMessage());
        }
    }
}