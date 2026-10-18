
public abstract class Person {
    public String name;
    private String email;
    protected String department;

    public Person(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAccessLevels() {
        System.out.println("Public name: " + name);
        System.out.println("Private email through getter: " + getEmail());
        System.out.println("Protected department: " + department);
    }

    public abstract String getRole();
}
