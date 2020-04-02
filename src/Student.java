import java.util.Scanner;

public class Student extends Person {
    private int studentID;
    private double score;
    private String email;

    public void inputStudentInfo () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email: ");
        this.email = sc.nextLine();
        System.out.println("Enter the student ID: ");
        this.studentID = sc.nextInt();
        System.out.println("Enter the medium score: ");
        this.score = sc.nextDouble();
    }

    public String getScholarship() {
        if (this.score > 8.0) {
            return "This student gets a scholarship!!";
        }
        return "This student gets a banana!";
    }

    public String printData() {
        return "Student{"
                + "studentID="
                + studentID
                + ", score="
                + score
                + ", email='"
                + email
                + '\''
                + '}';
    }
}
