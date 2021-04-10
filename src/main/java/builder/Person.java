package builder;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        if (hasAge() == false)
            System.out.println("age unknown");
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean hasAge() {
        boolean hasAge = age > -1 ? true : false;
        return hasAge;
    }

    public boolean hasAddress() {
        boolean hasAddress = address != null ? true : false;
        return hasAddress;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge() == true)
            age += 1;
        else
            System.out.println("ДР нет - возраст не известен");
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(4)
                .setAddress(address);
    }

    @Override
    public String toString() {
        return "Человек: " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + (hasAge() == true ? age : "возраст не известен") +
                ", address=" + (hasAddress() == true ? address : "адрес не известен");
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getAddress());
    }
}
