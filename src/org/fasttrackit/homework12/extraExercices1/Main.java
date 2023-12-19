package org.fasttrackit.homework12.extraExercices1;

import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        DailyPlannerExtra planner = new DailyPlannerExtra();

        planner.addActivity(Day.MONDAY, "Meeting");
        planner.addActivity(Day.MONDAY, "Exercise");
        planner.addActivity(Day.MONDAY, "Tenis");
        planner.addActivity(Day.MONDAY, "Laundry");
        planner.addActivity(Day.TUESDAY, "Gardening");
        planner.addActivity(Day.THURSDAY, "Gym");
        planner.addActivity(Day.THURSDAY, "Reading");
        planner.addActivity(Day.SATURDAY, "Party");

        System.out.println(Day.MONDAY + " " + planner.getActivities(Day.MONDAY));
        System.out.println(Day.TUESDAY + " " + planner.getActivities(Day.TUESDAY));
        System.out.println(Day.WEDNESDAY + " " + planner.getActivities(Day.WEDNESDAY));
        System.out.println(Day.THURSDAY + " " + planner.getActivities(Day.THURSDAY));
        System.out.println(Day.FRIDAY + " " + planner.getActivities(Day.FRIDAY));
        System.out.println(Day.SATURDAY + " " + planner.getActivities(Day.SATURDAY));
        System.out.println(Day.SUNDAY + " " + planner.getActivities(Day.SUNDAY));

        planner.removeActivity(Day.MONDAY, "Laundry");
        System.out.println(Day.MONDAY + " " + planner.getActivities(Day.MONDAY));

        System.out.println(planner);

        try {
            planner.removeActivity(Day.MONDAY, "Exercise");
            planner.removeActivity(Day.TUESDAY, "Yoga"); // This will throw NoActivityException
            planner.addActivity(Day.WEDNESDAY, null); // This will throw NoActivityException
            Map<Day, List<String>> activities = planner.endPlanning(); // This will throw NoActivitiesForDayException
        } catch (NoActivityException | NoActivitiesForDayException e) {
            System.out.println(e.getMessage());
        }

    }

}
