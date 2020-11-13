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

    public Student(String name, int age, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        studentId = UUID.randomUUID();
        username = getUsername();
    }

    @Override
    public String toString() {
        return name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public String getUsername() {
        username = name + age;
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String NewName) {
        name = NewName;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeStudent(this);
        }
    }

    public void addModule(Module module) {
        if (!modules.contains(module)) {
            modules.add(module);
            module.addStudent(this);
        }
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void removeModule(Module module) {
        if (modules.contains(module)) {
            modules.remove(module);
            module.removeStudent(this);
        }
    }

}
