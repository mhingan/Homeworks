package org.cursjava.ObjectContainers_Tema;

import java.util.List;
import java.util.Objects;

public class Person {
    /**
     * Creating the name and age variables, declaring a new list of hobby;
     * **/
    private String name;
    private int age;
    private List<Hobby> hobbies;


    /**
     *Creating the constructor for Person class;
     *  **/
    public Person(String name, int age, List<Hobby> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    /**
     * @getName; @getAge; @getHobbies - getters methods that returns name, age and hobbies of a person;
     * @addHobby - that methods is used to add a set a new hobby to a person;
     * **/
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void addHobby(Hobby hobby){
        hobbies.add(hobby);
    }


    /**
     *Override the @equals method;
     * **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(hobbies, person.hobbies);
    }


}
