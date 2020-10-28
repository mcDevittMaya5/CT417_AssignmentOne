import org.junit.jupiter.api.Test;
import java.time.*;
import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StudentTest {
    Course testCourse = new Course("4BP",LocalDate.of(2017,9,1),LocalDate.of(2021,6,5));
    Module testModule = new Module("Software Engineering","CT417");
    Student testStudent = new Student("Maya McDevitt",21,LocalDate.of(1999,6,16));
    @Test
    void usernameTest() {
        assertEquals("Maya McDevitt21",testStudent.getUsername());
    }

    @Test
    void getNameTest(){
        assertEquals("Maya McDevitt",testStudent.getName());
    }

    @Test
    void setNameTest()
    {
        testStudent.setName("Jane Doe");
        assertEquals("Jane Doe",testStudent.getName());
    }

    @Test
    void getDOBTest()
    {
        assertEquals(LocalDate.of(1999,6,16),testStudent.getDOB());
    }

    @Test
    void getStudentID()
    {
        UUID testStudentID;
        testStudentID = testStudent.getStudentId();
        //ensuring the same ID is returned each time this method is called
        assertEquals(testStudentID,testStudent.getStudentId());
    }

    @Test
    void addCourseTest()
    {
        testStudent.addCourse(testCourse);
        assertTrue(testStudent.getCourses().contains(testCourse));
        assertTrue(testCourse.getStudents().contains(testStudent));
    }

    @Test
    void removeCourseTest()
    {
        testStudent.addCourse(testCourse);
        testStudent.removeCourse(testCourse);
        assertFalse(testStudent.getCourses().contains(testCourse));
        assertFalse(testCourse.getModules().contains(testStudent)); // ensure the module list in course has been synced
    }

    @Test
    void getCourseTest()
    {
        ArrayList<Course> testCourses= new ArrayList<>();
        testCourses.add(testCourse);
        testStudent.addCourse(testCourse);
        assertEquals(testCourses,testStudent.getCourses());
    }

    @Test
    void AddModuleTest()
    {
        testStudent.addModule(testModule);
        assertTrue(testStudent.getModules().contains(testModule));
        assertTrue(testModule.getStudents().contains(testStudent));
    }

    @Test
    void removeModuleTest()
    {
        testStudent.addModule(testModule);
        testStudent.removeModule(testModule);
        assertFalse(testStudent.getModules().contains(testModule));
        assertFalse(testModule.getStudents().contains(testStudent));
    }

    @Test
    void getModuleTest()
    {
        ArrayList<Module> testModules = new ArrayList<>();
        testModules.add(testModule);
        testStudent.addModule(testModule);
        assertEquals(testModules,testStudent.getModules());

    }


    //to do add/remove and get  module

    
}