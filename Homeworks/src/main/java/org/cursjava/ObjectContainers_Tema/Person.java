package org.cursjava.ObjectContainers_Tema;

import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private List<Hobby> hobbies;

    public Person(String name, int age, List<Hobby> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(hobbies, person.hobbies);
    }


}
