package Classes;

import Interfaces.IGreet;

import org.apache.log4j.Logger;

public final class Consultant extends Employee implements IGreet {

    private static final Logger LOGGER = Logger.getLogger(Consultant.class);

    private String experience;

    Consultant() {
    }

    public Consultant(String name, String phoneNumber, String experience, String position, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.position = position;
        this.gender = gender;
    }

    public void setExperience() {
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Consultant" +
                "\nName and age: " + name +
                "\nPhone number: " + phoneNumber +
                "\nExperience: " + experience +
                "\nPosition: " + position +
                "\nGender: " + gender;
    }

    @Override
    public void sayGreet() {
        LOGGER.info(name + ": " + "Good afternoon!");
    }
}
