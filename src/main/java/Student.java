import java.time.*;
import java.util.ArrayList;
import java.util.UUID;

public class Student {

    private String name;
    private final int age;
    private final LocalDate DOB;
    private final UUID studentId;
    private String username;
    private ArrayList courses = new ArrayList<Course>();
    private ArrayList modules = new ArrayList<Module>();

    public Student(String name,int age,LocalDate DOB) {
        this.name=name;
        this.age = age;
        this.DOB=DOB;
        studentId = UUID.randomUUID();
        username = getUsername();
    }

    public String getUsername()
    {
        username = name + age;
        return username;
    }

    public String getName() {
        return name;
    }
    public void setName(String NewName)
    {
        name = NewName;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    public void addModule(Module module){
        courses.add(module);
    }

    public void removeModule(Module module){
        courses.add(module);
    }
}
