package org.fasttrackit.homework12.extraExercices1;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private Day day;
    private List<String> activities = new ArrayList<>();

    public DaySchedule(Day day) {
        this.day = day;
    }

    public Day getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        if (activity == null) {
            throw new NoActivityException("Activity cannot be null.");
        }
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        if (!activities.contains(activity)) {
            throw new NoActivityException("Activity does not exist for removal.");
        }
        activities.remove(activity);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}


