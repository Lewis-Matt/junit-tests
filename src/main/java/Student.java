import java.util.ArrayList;

public class Student {
    // ID should be a long number used to represent a "unique user" in our application.
    public static long id;
    // Name is a String that holds the name of the student.
    public static String name;
    // Grades is an ArrayList that contains a list of Integer numbers.
    public static ArrayList<Integer> grades;

    // The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
    public Student(String studentName, long studentID) {
        // this.id is for accessing instance variables. ID is set to static, so it belongs to the class. So using this.id is not correct. Could use Student.id, or just id.
        id = studentID;
        name = studentName;
        grades = new ArrayList<Integer>();
    }

    // returns the student's id
    public long getID() {
        return id;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}