package Classes;

import Interfaces.IGreet;
import Interfaces.ISalaryCount;
import org.apache.log4j.Logger;

public final class Seller extends Employee implements IGreet {

    private static  final Logger LOGGER = Logger.getLogger(Seller.class);

    private Integer experience;

    Seller() {
    }

    public Seller(String name, String phoneNumber, Integer experience, String position, String gender) {
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
        return "Seller" +
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
