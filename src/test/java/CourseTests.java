import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTests {
    Course testCourse = new Course("4BP",LocalDate.of(2017,9,1),LocalDate.of(2021,6,5));
    Module testModule = new Module("Software Engineering","CT417");
    Student testStudent = new Student("Maya McDevitt",21,LocalDate.of(1999,6,16));
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void getCourseName()
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
        assertEquals(true,testCourse.getModules().contains(testModule));
        testCourse.addModule(testModule);
        assertEquals("Module Software Engineering is already offered for this course",outputStreamCaptor.toString().trim());
    }

    @Test
    void removeModuleTest()
    {
        testCourse.removeModule(testModule);
        assertEquals("Module Software Engineering is not offered for this course",outputStreamCaptor.toString().trim());
        testCourse.addModule(testModule);
        testCourse.removeModule(testModule);
        assertEquals(true,!testCourse.getModules().contains(testModule));
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
        testCourse.addStudent(testStudent);
        assertEquals("Student Maya McDevitt is already Enrolled in this course",outputStreamCaptor.toString().trim());
    }

    @Test
    void removeStudentTest()
    {
        testCourse.removeStudent(testStudent);
        assertEquals("Student Maya McDevitt is not Enrolled in this course",outputStreamCaptor.toString().trim());
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
