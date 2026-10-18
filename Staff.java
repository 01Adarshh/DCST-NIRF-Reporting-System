
public class Staff extends Member implements Reportable, Payable {

    private String designation;
    private boolean teaching;
    private double monthlyPay;

    public Staff(int id, String name, String email,
                 String department, String designation,
                 boolean teaching, double monthlyPay) {

        super(id, name, email, department,
            teaching ? MemberType.TEACHING_STAFF
                     : MemberType.NON_TEACHING_STAFF);

        this.designation = designation;
        this.teaching = teaching;
        this.monthlyPay = monthlyPay;
    }

    @Override
    public String getRole() {
        return teaching ? "Teaching Staff" : "Non-teaching Staff";
    }

    @Override
    public void generateReport() {
        System.out.println(
            getRole() + ": " + name + " - " + designation
        );
    }

    @Override
    public double calculatePay() {
        return monthlyPay;
    }

    @Override
    public String toString() {
        return getRole() + ": " + name + " - " + designation;
    }
}
