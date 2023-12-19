package org.fasttrackit.homework.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    private List<Person> persons = new ArrayList<>();

    public PersonService(List<Person> persons) {
        this.persons.addAll(persons);
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.name(), person.age());
        }
        return result;
    }

    public Map<String, List<String>> mapHairColorToName() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            if (result.containsKey(person.hairColor())) {
                List<String> existingNames = result.get(person.hairColor());
                existingNames.add(person.name());
            } else {
                List<String> names = new ArrayList<>();
                names.add(person.name());
                result.put(person.hairColor(), names);
            }
        }
        return result;
    }
}
