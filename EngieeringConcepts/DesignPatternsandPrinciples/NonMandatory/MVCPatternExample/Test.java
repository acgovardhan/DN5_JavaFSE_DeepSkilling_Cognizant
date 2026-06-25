package MVCPatternExample;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        StudentView view = new StudentView();

        StudentController sc =  new StudentController(s1, view);
        sc.updateName("john doe");
        sc.updateId("john@113");
        sc.updateGrade(87);

        sc.sendDetails();
    }
}
