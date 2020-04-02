public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.inputPersonInfo();
        student1.inputStudentInfo();
        System.out.println(student1.toString());
        System.out.println(student1.printData());
        System.out.println(student1.getScholarship());
    }
}
