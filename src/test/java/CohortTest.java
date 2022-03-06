import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {
    // Test cases
    Cohort cohortWithOne;
    Cohort cohortWithMany;
    Student student1;
    Student student2;

    @Before
    public void setup() {
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student student1 = new Student(1234, "Matt");
        student1.addGrade(90);

        Student student2 = new Student(2, "Bob");
        student2.addGrade(70);
        student2.addGrade(80);

        // Add 1 student to cohortWithOne
        cohortWithOne.addStudent(student1);
        // Add 2 students to cohortWithMany
        cohortWithMany.addStudent(student1);
        cohortWithMany.addStudent(student2);
    }

    // Added the students in setUp(), testing if the Student was added to the List of students.
    // A Cohort instance can get the current List of students.
    @Test
    public void addStudentAddsTheStudent() {
        assertEquals(1, cohortWithOne.getStudents().size());
        assertEquals(2, cohortWithMany.getStudents().size());
    }

    // A Cohort instance can get the current List of students.
    @Test
    public void getStudentsReturnsStudents() {
        assertEquals("Matt", cohortWithOne.getStudents().get(0).getName());
    }

    @Test
    public void getAverageGradeReturnsAverage() {
        assertEquals(90, cohortWithOne.getCohortAverage(), 0.5);
        assertEquals(82, cohortWithMany.getCohortAverage(), 0.5);
        // student1 avg (70 + 80) / 2 = 75
        // student2 avg = 90
        // cohortWithTwo avg (75 + 90) / 2 = 82.5
    }
}

