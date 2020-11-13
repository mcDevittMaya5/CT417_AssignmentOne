import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String moduleID;
    private final ArrayList<Student> students = new ArrayList<>();
    private final ArrayList<Course> courses = new ArrayList<>();

    public Module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    @Override
    public String toString() {
        return moduleName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String name) {
        moduleName = name;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String id) {
        moduleID = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addModule(this); //This ensures that the list of modules stored in student is updated
        }
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            student.removeModule(this); //This ensures that the list of modules stored in student is updated
        }
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addModule(this); //This ensures that the list of modules stored in course is updated
        }
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeModule(this); //This ensures that the list of modules stored in course is updated
        }
    }
}
