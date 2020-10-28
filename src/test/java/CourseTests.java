import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseTests {
    Course testCourse = new Course("4BP",LocalDate.of(2017,9,1),LocalDate.of(2021,6,5));
    Module testModule = new Module("Software Engineering","CT417");
    Student testStudent = new Student("Maya McDevitt",21,LocalDate.of(1999,6,16));

    @Test
    void getCourseNameTest()
    {
        assertEquals("4BP",testCourse.getCourseName());
    }

    @Test
    void setCourseNameTest()
    {
        testCourse.setCourseName("3BP");
        assertEquals("3BP",testCourse.getCourseName());
    }

    @Test
    void getStartDateTest()
    {
        assertEquals(LocalDate.of(2017,9,1),testCourse.getStartDate());
    }

    @Test
    void getEndDateTest(){
        assertEquals(LocalDate.of(2021,6,5),testCourse.getEndDate());
    }

    @Test
    void AddModuleTest()
    {
        testCourse.addModule(testModule);
        assertTrue(testCourse.getModules().contains(testModule));
    }

    @Test
    void removeModuleTest()
    {
        testCourse.addModule(testModule);
        testCourse.removeModule(testModule);
        assertTrue(!testCourse.getModules().contains(testModule));
    }

    @Test
    void getModuleTest()
    {
        ArrayList<Module> testModules = new ArrayList<>();
        testModules.add(testModule);
        testCourse.addModule(testModule);
        assertEquals(testModules,testCourse.getModules());

    }

    @Test
    void addStudentTest()
    {
        testCourse.addStudent(testStudent);
        assertEquals(true,testCourse.getStudents().contains(testStudent));
        //assertEquals(true,testStudent.getCourses().contains(testCourse));
    }

    @Test
    void removeStudentTest()
    {
        testCourse.addStudent(testStudent);
        testCourse.removeStudent(testStudent);
        assertEquals(true,!testCourse.getStudents().contains(testStudent));
    }


    @Test
    void getStudentTest()
    {
        ArrayList<Student> testStudents = new ArrayList<>();
        testStudents.add(testStudent);
        testCourse.addStudent(testStudent);
        assertEquals(testStudents,testCourse.getStudents());
    }





}
