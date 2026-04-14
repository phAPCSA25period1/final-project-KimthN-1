import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Attendence round 1");
        Scanner scanner = new Scanner(System.in);
        // make empty arraylist with students
        ArrayList<ArrayList<Student>> seating_chart = new ArrayList<ArrayList<Student>>();

        // user input to put each student into roster
        for (int i = 0; i < 9; i++) {
            ArrayList<Student> row = new ArrayList<Student>();
            if (i == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at A:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }
            if (i == 1) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at B:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }

            if (i == 2) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at C:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }

            if (i == 3) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at D:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }

            if (i == 4) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at E:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }

            if (i == 5) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at F:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }

            if (i == 6) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at G:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }

            if (i == 7) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at H:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }

            if (i == 8) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Which student sits at I:" + j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today? (True/False)");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    Student newStudent = new Student(inputName, status);
                    row.add(newStudent);
                }
                seating_chart.add(row);
            }
        }
        scanner.close();
        for (int i = 0; i < seating_chart.size(); i++) {
            char rowLetter = (char) ('A' + i);
            System.out.print("Row " + rowLetter + ": ");
            ArrayList<Student> row = seating_chart.get(i);
            for (Student s : row) {
                System.out.print("[" + s + "] ");
            }
            System.out.println(); // Move to the next line for the next row
        }

    }
}


