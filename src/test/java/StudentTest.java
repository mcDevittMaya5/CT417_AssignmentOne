import org.junit.jupiter.api.Test;
import java.time.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    Student s1 = new Student("Maya McDevitt",21, LocalDate.of(1999,6,16));

    @Test
    void usernameTest() {
        assertEquals("Maya McDevitt21",s1.getUsername());
    }

    @Test
    void getNameTest(){
        assertEquals("Maya McDevitt",s1.getName());
    }

    //to do add/remove course

    //to do add/remove and print module

    
}