import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String email;
    private String phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class Student extends Person {
    private String course;

    public Student(String name, String email, String phone, String course) {
        super(name, email, phone);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

class Faculty extends Person {
    private String department;

    public Faculty(String name, String email, String phone, String department) {
        super(name, email, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
//import java.util.ArrayList;
//        import java.util.List;

 class Admin extends Person {
    private int adminId;
    private String adminPassword;

    public Admin(String name, String email, String phone,   String adminPassword,int adminId) {
        super(name,email,phone);
        this.adminId=adminId;
        this.adminPassword=adminPassword;
    }

    // Getter and Setter methods

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }


    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    // CRUD operations for Admin class

//    public static List<Admin> adminList = new ArrayList<>();


}

class ExaminationPortal {
    private ArrayList<Student> students;
    private ArrayList<Faculty> faculties;
    private ArrayList<Admin> adminList;

    public ExaminationPortal() {
        this.students = new ArrayList<Student>();
        this.faculties = new ArrayList<Faculty>();
        this.adminList = new ArrayList<Admin>();
    }

    // Create a new student
    public void createStudent(String name, String email, String phone, String course) {
        Student student = new Student(name, email, phone, course);
        students.add(student);
    }

    // Read all students
    public void readAllStudents() {
        System.out.println("All students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Email: " + student.getEmail() + ", Phone: " + student.getPhone() + ", Course: " + student.getCourse());
        }
    }

    // Update a student
    public void updateStudent(String email, String name, String phone, String course) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                student.setName(name);
                student.setPhone(phone);
                student.setCourse(course);
                System.out.println("Student details updated!");
                break;
            }
        }
    }

    // Delete a student
    public void deleteStudent(String email) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getEmail().equals(email)) {
                students.remove(i);
                break;
            }
        }
    }

    // Create a new faculty member
    public void createFaculty(String name, String email, String phone, String department) {
        Faculty faculty = new Faculty(name, email, phone, department);
        faculties.add(faculty);
    }

    // Read all faculty members
    public void readAllFaculties() {
        System.out.println("All faculties:");
        for (Faculty faculty : faculties) {
            System.out.println("Name: " + faculty.getName() + ", Email: " + faculty.getEmail() + ", Phone: " + faculty.getPhone() + ", Department: " + faculty.getDepartment());
        }
    }

    // Update a faculty member
    public void updateFaculty(String email, String name, String phone, String department) {
        for (Faculty faculty : faculties) {
            if (faculty.getEmail().equals(email)) {
                faculty.setName(name);
                faculty.setPhone(phone);
                faculty.setDepartment(department);
                break;
            }
        }
    }

    // Delete a faculty member
    public void deleteFaculty(String email) {
        for (int i = 0; i < faculties.size(); i++) {
            Faculty faculty = faculties.get(i);
            if (faculty.getEmail().equals(email)) {
                faculties.remove(i);
                break;
            }
        }
    }

    //CRUD for ADMIN
    // Create operation
    public void createAdmin(int adminId, String adminName, String adminEmail, String adminPassword, String phone) {
        Admin newAdmin = new Admin(adminName, adminEmail, phone, adminPassword,adminId);
        adminList.add(newAdmin);
//        System.out.println("New Admin created successfully!");
    }

    // Read operation
    public void viewAdmin(int adminId) {
        for (Admin admin : adminList) {
            if (admin.getAdminId() == adminId) {
                System.out.println("Admin Id: " + admin.getAdminId());
                System.out.println("Admin Name: " + admin.getName());
                System.out.println("Admin Email: " + admin.getEmail());
                return;
            }
        }
        System.out.println("Admin not found!");
    }

    //Read all admins
    public void readAllAdmins() {
        System.out.println("All Admin:");
        for (Admin admin : adminList) {
            System.out.println("Name: " + admin.getName() + ", Email: " + admin.getEmail() + ", Phone: " + admin.getPhone() + ", Admin ID: " + admin.getAdminId());
        }
    }

    // Update operation
    public void updateAdmin(int adminId, String adminName, String adminEmail, String adminPassword) {
        for (Admin admin : adminList) {
            if (admin.getAdminId() == adminId) {
                admin.setName(adminName);
                admin.setEmail(adminEmail);
                admin.setAdminPassword(adminPassword);
                System.out.println("Admin updated successfully!");
                return;
            }
        }
        System.out.println("Admin not found!");
    }

    // Delete operation
    public void deleteAdmin(int adminId) {
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getAdminId() == adminId) {
                adminList.remove(i);
                System.out.println("Admin deleted successfully!");
                return;
            }
        }
        System.out.println("Admin not found!");
    }
}
public class Main {
    public static void main(String[] args) {
        ExaminationPortal portal = new ExaminationPortal();
        // Create a new student
        portal.createStudent("John Doe", "john.doe@example.com", "123-456-7890", "Computer Science");
        portal.createStudent("Jane Austin","jane.austin@example.com","43643284","Information Technology");

        // Read all students
        portal.readAllStudents();

        // Update a student
        portal.updateStudent("john.doe@example.com", "John M. Doe", "987-654-3210", "Electrical Engineering");

        portal.readAllStudents();

        // Delete a student
        portal.deleteStudent("john.doe@example.com");

        // Create a new faculty member
        portal.createFaculty("Jane Smith", "jane.smith@example.com", "123-456-7890", "Mathematics");
        portal.createFaculty("Adam Levine","adam.levine@example.com","43834432","Mechanical & Automation");

        // Read all faculty members
        portal.readAllFaculties();

        // Update a faculty member
        portal.updateFaculty("jane.smith@example.com", "Jane M. Smith", "987-654-3210", "Computer Science");
        portal.readAllFaculties();
        // Delete a faculty member
        portal.deleteFaculty("jane.smith@example.com");
        System.out.println("Faculty deleted");
        portal.readAllFaculties();

        //Create a new admin
        portal.createAdmin(123,"Arun Sharma","aruns@example.com","arun123@12","9838263");

        //Read all admins
        portal.readAllAdmins();






    }
}
