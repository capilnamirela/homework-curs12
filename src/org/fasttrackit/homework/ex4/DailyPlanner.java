package org.fasttrackit.homework.ex4;

import org.fasttrackit.homework12.extraExercices1.Day;
import org.fasttrackit.homework12.extraExercices1.DaySchedule;
import org.fasttrackit.homework12.extraExercices1.NoActivitiesForDayException;


import java.util.*;

public class DailyPlanner {
    public List<DaySchedule> daySchedule;

    public DailyPlanner() {
        daySchedule = new ArrayList<>();
        for (Day day : Day.values()) {
            daySchedule.add(new DaySchedule(day));
        }
    }

    public void addActivity(Day day, String activity) {
        for (DaySchedule schedule : daySchedule) {
            if (schedule.getDay() == day) {
                schedule.addActivity(activity);
                return;
            }
        }
    }

    public void removeActivity(Day day, String activity) {
        for (DaySchedule schedule : daySchedule) {
            if (schedule.getDay() == day) {
                schedule.removeActivity(activity);
                return;
            }
        }
    }

    public List<String> getActivities(Day day) {
        for (DaySchedule schedule : daySchedule) {
            if (schedule.getDay() == day) {
                return schedule.getActivities();
            }
        }
        return Collections.emptyList();
    }

    public Map<Day, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<Day, List<String>> plannedActivities = new HashMap<>();
        for (DaySchedule schedule : daySchedule) {
            List<String> activities = schedule.getActivities();
            if (activities.isEmpty()) {
                throw new NoActivitiesForDayException("No activities for " + schedule.getDay());
            }
            plannedActivities.put(schedule.getDay(), activities);
        }
        return plannedActivities;
    }
}
