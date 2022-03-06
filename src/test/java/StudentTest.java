import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void hasID() {
        assertEquals(0.0, Student.id, 0);
    }

    @Test
    public void hasName() {
        assertNull(Student.name);
    }

    @Test
    public void hasGrades() {
        assertNull(Student.grades);
    }

    @Test
    public void isNamesInitialized() {
        assertNotNull("name initialization issue", Student.name);
    }

    @Test
    public void isGradesInitialized() {
        assertNotNull("grades initialization issue", Student.grades);
    }

    @Test
    public void getIdReturnsId() {
        Student student1 = new Student("1", 1);
        assertEquals("ID does not match as expected", 1, student1.getId());
    }

    @Test
    public void getNameReturnsName() {
        Student student1 = new Student("1", 1);
        assertEquals("Name does not match as expected", "1", student1.getName());
    }

    @Test
    public void getGradesIsInitialized() {
        Student student1 = new Student("1", 1);
        assertTrue(student1.grades.isEmpty());
    }

    @Test
    public void addGradeAddsGrade() {
        Student student1 = new Student("1", 1);
        student1.addGrade(90);
        ArrayList<Integer> test = new ArrayList<>();
        test.add(90);
        assertEquals(student1.grades, test);
    }

    @Test
    public void getGradesReturnsGrades() {
        Student student1 = new Student("1", 1);
        student1.addGrade(90);
        assertEquals(student1.grades, student1.getGrades());
    }

    @Test
    public void getGradeAverageReturnsAverage() {
        Student student1 = new Student("1", 1);
        student1.addGrade(90);
        student1.addGrade(100);

        assertEquals(student1.getGradeAverage(), 95.0, 0);
    }
}