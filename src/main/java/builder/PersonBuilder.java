package builder;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0)
            throw new IllegalArgumentException("возраст не корректен!!!!!!! " + age);
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (surname == null)
            throw new IllegalStateException("не заполнено обязательное поле! - фамилия");
        return new Person(name, surname, age, address);
    }
}
