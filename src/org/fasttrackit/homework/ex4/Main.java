package org.fasttrackit.homework.ex4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaySchedular daySchedular = new DaySchedular(DayOfTheWeek.MONDAY, List.of("ma trezesc", "mananc", "etc"));
        System.out.println(daySchedular);
    }
}
