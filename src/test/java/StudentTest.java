import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    // Initialize test student
    Student student1;

    // When writing tests, it is common to find that several tests need similar objects or variables created before they can be run. Annotating a public void method with @Before causes that method to be run before the @Test method.
    @Before
    public void setUp() {
        // Test student 1
        student1 = new Student("Matt", 1234);
    }

    @Test
    public void studentIsInitialized() {
        assertNotNull("student1 not initialized.", student1);
    }

    @Test
    public void isNamesInitialized() {
        // assertTrue(message, object != null);
        assertNotNull("name not initialized.", Student.name);
    }

    @Test
    public void isGradesInitialized() {
        // assertTrue(message, object != null);
        assertNotNull("grades not initialized.", Student.grades);
    }

    @Test
    public void getIDReturnsID() {
        // assertEquals((String)null, expected, actual, delta);
        assertEquals(1234, student1.getID());
    }

    @Test
    public void getNameReturnsName() {
        assertEquals("Name does not match as expected", "Matt", student1.getName());
    }

    @Test
    public void addGradeAddsGrade() {
        student1.addGrade(70);
        student1.addGrade(80);
        student1.addGrade(90);
        // Test ArrayList with Integers added
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(70);
        testList.add(80);
        testList.add(90);
        assertEquals(student1.grades, testList);
    }

    @Test
    public void getGradesReturnsGrades() {
        student1.addGrade(70);
        student1.addGrade(80);
        student1.addGrade(90);
        assertEquals(student1.grades, student1.getGrades());
    }

    @Test
    public void getGradeAverageReturnsAverage() {
        student1.addGrade(70);
        student1.addGrade(80);
        student1.addGrade(90);
        // avg = 80
        assertEquals(student1.getGradeAverage(), 80.0, 0);
    }
}