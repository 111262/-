import org.junit.*;

import static org.junit.Assert.*;
public class StudentTest {

    static Student student;

    @Test
    public void getAge() {
        assertEquals(5, student.getAge());
    }

    @BeforeClass
    public static void beforeClass(){
        student = new Student();
        System.out.println("Before Class");
    }

    @Before
    public void before(){
        System.out.println("Before Method");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @After
    public void after(){
        System.out.println("After Method");
    }
}