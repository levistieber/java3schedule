import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Student> members;

    public Group(String name, ArrayList<Student> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getMembers() {
        return members;
    }

    public void addStudent(Student student) {
        this.members.add(student);
    }
    
    public void removeStudent(Student student) {
        this.members.remove(student);
    }
}
