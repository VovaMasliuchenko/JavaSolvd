package Classes;

import Exceptions.SecurityException;
import Interfaces.IGreet;
import Interfaces.IKickOut;
import Interfaces.ISalaryCount;
import org.apache.log4j.Logger;

public final class Security extends Employee implements IGreet, IKickOut {

    private static  final Logger LOGGER = Logger.getLogger(Security.class);

    private Integer experience;

    Security() {
    }

    public Security(String name, String phoneNumber, Integer experience, String position, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.position = position;
        this.gender = gender;
    }

    public void setExperience(Integer experience) throws SecurityException {
        if (experience <= 1) {
            throw new SecurityException("Experience cannot be less than 1 year");
        } else {
            this.experience = experience;
        }
    }

    public Integer getExperience() {
        return experience;
    }

    public String toString() {
        return "Security" +
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

    @Override
    public void kickOut() {
        LOGGER.info(name + ": " + "Get out of here!");
    }

    ISalaryCount calculateSalary = (experience) -> 1500 * experience;

    public void lambdaReturn() {
        int result = calculateSalary.calculateSalary(experience);
        LOGGER.info("Salary of "+name+": "+result);
    }

}
