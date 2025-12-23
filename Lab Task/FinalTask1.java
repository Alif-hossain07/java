public class FinalTask1 {
static class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

static class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfStudents];
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more students to " + schoolName);
        }
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + students[i].getName());
        }
    }
}

static class Contact {
    private String email;
    private long number;

    public Contact(String email, long number) {
        this.email = email;
        this.number = number;
    }

    public void showContactInfo() {
        System.out.println(" Email: " + email);
        System.out.println("Number: " + number);
    }
}

public static class AssociationRelationship {
    public static void main(String[] args) {

        School school = new School("Faridpur zilla school", 4);
        school.addStudent(new Student("Alif"));
        school.addStudent(new Student("shera"));
        school.addStudent(new Student("tanjil"));
        school.addStudent(new Student("kabbo"));
        school.showStudents();
        System.out.println();

        Contact cntc = new Contact("alifhossain989@gmail.com", 1902527967);

        cntc.showContactInfo();
    }
}
}
