package org.example.unchecked;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Без понятия как написать тест для этого потому что тут значения каждый раз разные из-за рандома.
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(PersonCreator.createPerson(10));
        }
        persons.stream().filter(person -> person != null).filter(person -> person.getAge() > 14).filter(person -> person.getAddress() != null).forEach(System.out::println);
    }
}

@ToString
@Getter
class Person {

    private int age;
    private String address;

    Person(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Age can`t be more than 15");
        }
        int randomAgeAddition = Double.valueOf(Math.random() * 10).intValue();
        int random = Double.valueOf(Math.random() * 10).intValue();
        this.age = age + randomAgeAddition;
        if (random > 5) {
            this.address = "Amazing street №" + random;
        }
    }
}

class PersonCreator {

    public static Person createPerson(int minDesiredAge) {
        int random = Double.valueOf(Math.random() * 10).intValue();
        if (random > 5) {
            return new Person(minDesiredAge);
        }
        return null;
    }
}
