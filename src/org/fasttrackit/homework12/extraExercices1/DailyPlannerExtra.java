package org.fasttrackit.homework12.extraExercices1;

import java.util.*;

public class DailyPlannerExtra {
    private List<DaySchedule> schedules = new ArrayList<>();

    public DailyPlannerExtra() {
        for (Day day : Day.values()) {
            schedules.add(new DaySchedule(day));
        }
    }

    public void addActivity(Day day, String activity) throws NoActivityException {
        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                schedule.addActivity(activity);
            }
        }
    }

    public void removeActivity(Day day, String activity) throws NoActivityException {
        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                schedule.removeActivity(activity);
            }
        }
    }

    public List<String> getActivities(Day day) {
        for (DaySchedule schedule : schedules) {
            if (schedule.getDay() == day) {
                return schedule.getActivities();
            }
        }
        return Collections.emptyList();
    }

    public Map<Day, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<Day, List<String>> activitiesMap = new HashMap<>();
        for (DaySchedule schedule : schedules) {
            List<String> activities = schedule.getActivities();
            if (activities.isEmpty()) {
                throw new NoActivitiesForDayException("No activities for " + schedule.getDay() + ".");
            }
            activitiesMap.put(schedule.getDay(), activities);
        }
        return activitiesMap;
    }

    @Override
    public String toString() {
        return "DailyPlannerExtra{" + "schedules=" + schedules + '}';
    }
}
