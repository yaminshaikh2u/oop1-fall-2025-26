package Lab;

// -------------------- CONTACT --------------------
class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public void showContact() {
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}

// -------------------- STUDENT --------------------
class Student {
    private String name;
    private Contact contact; 

    public Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public void showStudent() {
        System.out.println("Student Name: " + name);
        contact.showContact();
    }
}

// -------------------- SCHOOL --------------------
class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int size) {
        this.schoolName = schoolName;
        students = new Student[size]; 
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Cannot add more students");
        }
    }

    public void showStudents() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Students List:");
        for (int i = 0; i < count; i++) {
            students[i].showStudent();
            System.out.println();
        }
    }
}

// -------------------- MAIN --------------------
public class SchoolAssociation {
    public static void main(String[] args) {

        School school = new School("AIUB", 2);

        Contact c1 = new Contact("01411111111", "yamin@gmail.com");
        Student s1 = new Student("Yamin", c1);

        Contact c2 = new Contact("01922222222", "seikh@gmail.com");
        Student s2 = new Student("Seikh", c2);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
    }
}