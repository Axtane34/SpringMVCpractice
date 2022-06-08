package ru.axtane.springMVC.dao;

import org.springframework.stereotype.Component;
import ru.axtane.springMVC.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Bob"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
        people.add(new Person(++PEOPLE_COUNT, "Katy"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){

        return people.stream().filter(people -> people.getId() == id).findAny().orElse(null);
    }
}
