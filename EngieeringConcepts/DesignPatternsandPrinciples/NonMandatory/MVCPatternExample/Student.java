package MVCPatternExample;

//model class
public class Student {
    private String name;
    private String id;
    private int grade;

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public int getGrade(){
        return grade;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }
}
