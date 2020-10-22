import java.time.*;
import java.util.ArrayList;
import java.util.UUID;

public class Student {

    private String name;
    private final int age;
    private final LocalDate DOB;
    private final UUID studentId;
    private String username;
    private final ArrayList<Course> courses = new ArrayList<>();
    private final ArrayList<Module> modules = new ArrayList<>();

    public Student(String name,int age,LocalDate DOB) {
        this.name=name;
        this.age = age;
        this.DOB=DOB;
        studentId = UUID.randomUUID();
        username = getUsername();
    }

    @Override
    public String toString()
    {
        return name;
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

    public void printCourses() {
        for (Course i : courses)
        {
            System.out.println(i);
        }
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public void printModule() {
        for (Module i : modules)
        {
            System.out.println(i);
        }
    }

    public void removeModule(Module module){
        modules.add(module);
    }

}
