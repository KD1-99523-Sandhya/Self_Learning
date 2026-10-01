package Question_1;

public class Student implements Cloneable {
    private int roll;
    private String name;
    private Address address;

    public Student() {
        this.roll = 0;
        this.name = "";
        this.address = new Address();
    }

    public Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public Student(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.address = new Address(other.address.getCity(), other.address.getState());
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student shallowCopy() throws CloneNotSupportedException {

        return (Student) super.clone();
    }

    public Student deepCopy() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
        copy.address = this.address.clone();
        return copy;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
    }
}
