
public class CloneDemo {

    public static void run() throws CloneNotSupportedException {
        StudentProfile original =
            new StudentProfile("Example Student",
                               new Address("Panaji"));

        StudentProfile shallow = original.clone();
        StudentProfile deep = original.deepClone();

        shallow.address.city = "Margao";

        System.out.println("After changing shallow copy:");
        System.out.println(
            "Original city: " + original.address.city
        );

        System.out.println(
            "Deep copy city: " + deep.address.city
        );
    }
}
