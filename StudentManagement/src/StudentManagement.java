/**
 *
 * @author TIEGO MFULOANE ST10345884
 */
import java.util.Scanner;

public class StudentManagement {
    private static final int MAX_STUDENTS = 100;
    private String[] studentIDs = new String[MAX_STUDENTS];
    private String[] studentNames = new String[MAX_STUDENTS];
    private int[] studentAges = new int[MAX_STUDENTS];
    private String[] studentEmails = new String[MAX_STUDENTS];
    private String[] studentCourses = new String[MAX_STUDENTS];
    private int studentCount = 0;

    public void saveStudent(String string, String john_Doe, int par, String johndoeexamplecom, String String) {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Cannot add more students. The array is full.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("CAPTURE NEW STUDENT");
        System.out.println("****************************************************");
        System.out.print("Enter the student ID: ");
        studentIDs[studentCount] = scanner.nextLine();
        System.out.print("Enter the student name: ");
        studentNames[studentCount] = scanner.nextLine();
        studentAges[studentCount] = getValidAge(scanner);
        System.out.print("Enter the student email: ");
        studentEmails[studentCount] = scanner.nextLine();
        System.out.print("Enter the student course: ");
        studentCourses[studentCount] = scanner.nextLine();

        studentCount++;
        System.out.println("Student details have been successfully saved.");
    }

    private int getValidAge(Scanner scanner) {
        int age = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter the student age: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) {
                    valid = true;
                } else {
                    System.out.println("You have entered an incorrect student age !!! Please re-enter the student age >>");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect student age !!! Please re-enter the student age >>");
            }
        }
        return age;
    }

    public void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        String studentID = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentIDs[i].equals(studentID)) {
                displayStudent(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with Student ID: " + studentID + " was not found!");
        }
    }

    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        String studentID = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentIDs[i].equals(studentID)) {
                for (int j = i; j < studentCount - 1; j++) {
                    studentIDs[j] = studentIDs[j + 1];
                    studentNames[j] = studentNames[j + 1];
                    studentAges[j] = studentAges[j + 1];
                    studentEmails[j] = studentEmails[j + 1];
                    studentCourses[j] = studentCourses[j + 1];
                }
                studentCount--;
                System.out.println("Student with Student ID: " + studentID + " was deleted!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with Student ID: " + studentID + " was not found!");
        }
    }

    public void studentReport() {
        if (studentCount == 0) {
        System.out.println("No students to display.");
    } else {
        for (int i = 0; i < studentCount; i++) {
            System.out.println("STUDENT " + (i + 1));
            displayStudent(i);
        }
        }
    }

    private void displayStudent(int index) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Student ID: " + studentIDs[index]);
        System.out.println("Student Name: " + studentNames[index]);
        System.out.println("Student Age: " + studentAges[index]);
        System.out.println("Student Email: " + studentEmails[index]);
        System.out.println("Student Course: " + studentCourses[index]);
        System.out.println("---------------------------------------------------------------");
    }

    public void exitStudentApplication() {
        System.out.println("Exiting Student Management Application...");
        System.exit(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        while (true) {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("****************************************************");
            System.out.print("Enter (1) to launch menu or any other key to exit: ");
            String input = scanner.nextLine();
            if (!input.equals("1")) {
                sm.exitStudentApplication();
            }

            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture a new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report.");
            System.out.println("(5) Exit Application.");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    sm.saveStudent("10111", "J Bloggs", 19, "jbloggs@ymail.com", "disd");
                    break;
                case "2":
                    sm.searchStudent();
                    break;
                case "3":
                    sm.deleteStudent();
                    break;
                case "4":
                    sm.studentReport();
                    break;
                case "5":
                    sm.exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
