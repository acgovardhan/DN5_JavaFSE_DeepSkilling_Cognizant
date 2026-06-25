package MVCPatternExample;

public class StudentController {
    //controller
    //handles communication between model and view
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView){
        this.student = student;
        this.studentView = studentView;
    }

    public void updateName(String name){
        student.setName(name);
    }

    public void updateId(String id){
        student.setId(id);
    }

    public void updateGrade(int grade){
        student.setGrade(grade);
    }

    public void sendDetails(){
        studentView.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    } 
}
