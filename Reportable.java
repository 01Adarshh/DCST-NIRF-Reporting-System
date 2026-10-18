
public interface Reportable {
    void generateReport();
}

interface Printable {
    void printDetails();
}

interface Payable {
    double calculatePay();
}

interface CampusMember extends Reportable, Printable {
}
