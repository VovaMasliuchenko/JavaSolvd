package Classes;

import org.apache.log4j.Logger;

public class Employee extends Person {

    private static final Logger LOGGER = Logger.getLogger(Employee.class);

    protected String position;

    Employee() {
    }

    public Employee(String name, String phoneNumber, String position, Integer age, String gender) {
        super(name, phoneNumber, age, gender);
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void helpForUser(String help) {
        LOGGER.info("Help: " + help + "\nby: " + getName());
    }

    @Override
    public String toString() {
        return "Employee" +
                "\nName and age: " + name + " " + age + " y.o" +
                "\nPhone number: " + phoneNumber +
                "\nPosition: " + position;
    }

}
