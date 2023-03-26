import java.io.*;
public class Student {
    private String name;
    private int id;
    private ArrayList<String> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Courses: " + courses);
    }
}

public class GraduateStudent extends Student {
    private String researchArea;

    public GraduateStudent(String name, int id, String researchArea) {
        super(name, id);
        this.researchArea = researchArea;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Research area: " + researchArea);
    }
}



// create a Student object
Student student1 = new Student("Alice", 12345);

// add courses to the student's enrollment
student1.addCourse("Math");
student1.addCourse("Science");

// print the student's information
student1.printInfo();

// create a GraduateStudent object
GraduateStudent gradStudent1 = new GraduateStudent("Bob", 67890, "Computer Science");

// add courses to the graduate student's enrollment
gradStudent1.addCourse("Algorithms");
gradStudent1.addCourse("Machine Learning");

// print the graduate student's information
gradStudent1.printInfo();
