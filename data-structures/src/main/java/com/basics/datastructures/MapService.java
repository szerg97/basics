package com.basics.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapService implements Service{

    private final Map<Integer, String> intStringMap = new HashMap<>();
    private final List<Person> people = new ArrayList<>();

    @Override
    public void test() {
        seed();
        intStringMap.forEach(this::writeOut);

        List<String> values = intStringMap.values().stream()
                .map(this::transform)
                .collect(Collectors.toList());
        values.forEach(this::writeOut);

        List<String> phoneNumbers = people.stream()
                .flatMap(person -> person.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        phoneNumbers.forEach(this::writeOut);
    }

    private void seed() {
        intStringMap.put(1, "Adam");
        intStringMap.put(2, "Benjamin");
        intStringMap.put(3, "Charlie");
        intStringMap.put(4, "Diana");
        intStringMap.put(5, "Ellie");

        people.addAll(List.of(
                new Person("Adam", List.of("+3630131322","+36301787822")),
                new Person("Ayman", List.of("+36399922")),
                new Person("Charlie", List.of("+36898999","+362111120")),
                new Person("Cecil", List.of("+36399922","+362311422")),
                new Person("Billy", List.of("+36898999")),
                new Person("Brown", List.of("+36888899","+3623333320"))

        ));
    }

    private String transform(String s){
        return String.format("%s is %s long", s, s.length());
    }

    private void writeOut(Integer key, String value){
            System.out.printf("Key: %s, Value: %s%n", key, value);
    }

    private void writeOut(Object value){
        System.out.printf("Value: %s%n", value);
    }

    static class Person{
        private final String name;
        private final List<String> phoneNumbers;

        Person(String name, List<String> phoneNumbers) {
            this.name = name;
            this.phoneNumbers = phoneNumbers;
        }

        public String getName() {
            return name;
        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }
    }
}
