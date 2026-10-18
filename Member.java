
public class Member extends Person {

    public enum MemberType {
        STUDENT, TEACHING_STAFF, NON_TEACHING_STAFF
    }

    public enum Program {
        MCA, BCA, MSC_COMPUTER_SCIENCE
    }

    private static int memberCount = 0;

    private final int id;
    private final MemberType type;

    public Member(int id, String name, String email,
                  String department, MemberType type) {
        super(name, email, department);
        this.id = id;
        this.type = type;
        memberCount++;
    }

    public int getId() {
        return id;
    }

    public MemberType getType() {
        return type;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    public static void displayMemberCount() {
        System.out.println(
            "Total member objects created: " + memberCount
        );
    }

    @Override
    public String getRole() {
        return type.toString();
    }
}
