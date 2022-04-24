package Classes;

import Interfaces.IGreet;

import Interfaces.ISalaryCount;
import org.apache.log4j.Logger;

public final class Consultant extends Employee implements IGreet {

    private static final Logger LOGGER = Logger.getLogger(Consultant.class);

    private int experience;

    Consultant() {
    }

    public Consultant(String name, String phoneNumber, int experience, String position, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.position = position;
        this.gender = gender;
    }

    public void setExperience() {
        this.experience = experience;
    }

    public Integer getExperience() {
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

    ISalaryCount calculateSalary = (experience) -> 1500 * experience;


    public void lambdaReturn() {
        int result = calculateSalary.calculateSalary(experience);
        LOGGER.info("Salary of "+name+": "+result);
    }

}
