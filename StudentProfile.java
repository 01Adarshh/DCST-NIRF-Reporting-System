
public class StudentProfile implements Cloneable {
    String name;
    Address address;

    public StudentProfile(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy shares the Address object
    @Override
    public StudentProfile clone()
            throws CloneNotSupportedException {
        return (StudentProfile) super.clone();
    }

    // Deep copy creates a separate Address object
    public StudentProfile deepClone()
            throws CloneNotSupportedException {
        StudentProfile copy = (StudentProfile) super.clone();
        copy.address = address.clone();
        return copy;
    }
}
