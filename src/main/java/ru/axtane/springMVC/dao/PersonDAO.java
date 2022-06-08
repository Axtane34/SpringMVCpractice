package ru.axtane.springMVC.dao;

import org.springframework.stereotype.Component;
import ru.axtane.springMVC.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;

    {
        people = new ArrayList<>();

        Collections.addAll(people,
                new Person(++PEOPLE_COUNT, "Tom"),
                new Person(++PEOPLE_COUNT, "Bob"),
                new Person(++PEOPLE_COUNT, "Mike"),
                new Person(++PEOPLE_COUNT, "Katty"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){

        return people.stream().filter(people -> people.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}
