package Question_1;

public class Address implements Cloneable {
    private String city;
    private String state;

    public Address() {
        this.city = "";
        this.state = "";
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + "]";
    }
}
