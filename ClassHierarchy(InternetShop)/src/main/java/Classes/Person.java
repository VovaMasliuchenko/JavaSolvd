package Classes;

import Exceptions.WarehouseException;

public abstract class Person {

    protected String name;
    protected String phoneNumber;
    protected Integer age;
    protected String gender;

    Person() {
    }

    public Person(String name, String phoneNumber, Integer age, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) throws WarehouseException {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getAge() {
        return age;
    }
}
