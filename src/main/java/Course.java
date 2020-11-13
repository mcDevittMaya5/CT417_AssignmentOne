import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private final ArrayList<Module> modules = new ArrayList<>();
    private final ArrayList<Student> students = new ArrayList<>();
    private final LocalDate startDate;
    private final LocalDate endDate;

    public Course(String courseName, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        if (!modules.contains(module)) {
            modules.add(module);
            module.addCourse(this);
        }
    }

    public void removeModule(Module module) {
        if (modules.contains(module)) {
            modules.remove(module);
            module.removeCourse(this);
        }

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this); //adding the course to the student
        }
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            student.removeCourse(this); //adding the course to the student
        }
    }

}
