import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ModuleTest {
    Course testCourse = new Course("4BP",LocalDate.of(2017,9,1),LocalDate.of(2021,6,5));
    Module testModule = new Module("Software Engineering","CT417");
    Student testStudent = new Student("Maya McDevitt",21,LocalDate.of(1999,6,16));

    @Test
    void getModuleNameTest() {assertEquals("Software Engineering",testModule.getModuleName());}

    @Test
    void setModuleNameTest()
    {
        testModule.setModuleName("Software Engineering 1");
        assertEquals("Software Engineering 1",testModule.getModuleName());
    }

    @Test
    void getModuleIDTest() {assertEquals("CT417",testModule.getModuleID());}

    @Test
    void setModuleIDTest()
    {
        testModule.setModuleID("CT418");
        assertEquals("CT418",testModule.getModuleID());
    }

    @Test
    void addStudentTest()
    {
        testModule.addStudent(testStudent);
        assertTrue(testModule.getStudents().contains(testStudent));
        assertTrue(testStudent.getModules().contains(testModule));
    }

    @Test
    void removeStudentTest()
    {
        testModule.addStudent(testStudent);
        testModule.removeStudent(testStudent);
        assertFalse(testModule.getStudents().contains(testStudent));
        assertFalse(testStudent.getModules().contains(testModule));
    }

    @Test
    void getStudentsTest()
    {
        ArrayList<Student> testStudents = new ArrayList<>();
        testStudents.add(testStudent);
        testModule.addStudent(testStudent);
        assertEquals(testStudents,testModule.getStudents());
    }

    @Test
    void addCourseTest()
    {
        testModule.addCourse(testCourse);
        assertTrue(testModule.getCourses().contains(testCourse));
        assertTrue(testCourse.getModules().contains(testModule));
    }

    @Test
    void removeCourseTest()
    {
        testModule.addCourse(testCourse);
        testModule.removeCourse(testCourse);
        assertFalse(testModule.getCourses().contains(testCourse));
        assertFalse(testCourse.getModules().contains(testModule)); // ensure the module list in course has been synced
    }

    @Test
    void getCourseTest()
    {
        ArrayList<Course> testCourses= new ArrayList<>();
        testCourses.add(testCourse);
        testModule.addCourse(testCourse);
        assertEquals(testCourses,testModule.getCourses());
    }



}
