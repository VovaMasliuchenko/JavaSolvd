package Classes;

public final class Client extends Person {

    private String country;
    private String address;

    Client() {
    }

    public Client(String name, String phoneNumber, String country, String address, Integer age, String gender) {
        super(name, phoneNumber, age, gender);
        this.country = country;
        this.address = address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Client" +
                "\nName and age: " + name + " " + age + " y.o" +
                "\nPhone number: " + phoneNumber +
                "\nCountry: " + country +
                "\nAddress: " + address;
    }

}
