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
                new Person(++PEOPLE_COUNT, "Tom", 27, "tom@mail.ru"),
                new Person(++PEOPLE_COUNT, "Bob", 21, "bob@mail.ru"),
                new Person(++PEOPLE_COUNT, "Mike", 24, "mike@gmail.com"),
                new Person(++PEOPLE_COUNT, "Katty", 17, "katty@gmail.com"));
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

    public void update(int id, Person updatedPerson){
        Person personToBeUpdate = show(id);
        personToBeUpdate.setName(updatedPerson.getName());
        personToBeUpdate.setAge(updatedPerson.getAge());
        personToBeUpdate.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id){
        people.removeIf(x->x.getId() == id);
    }
}
