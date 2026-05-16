import java.util.ArrayList;
import java.util.Scanner;

public class App {
    /**
     * Entry point for the attendance seating chart application.
     * It collects student names and attendance status, displays the seating chart,
     * and prints lists of absent and late students.
     *
     * @param args command-line arguments (not used)
     * @throws Exception if an input or runtime error occurs
     */
    public static void main(String[] args) throws Exception {

        // take attendence from rows
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> rowA = new ArrayList<Student>();
        boolean statusA = true;
        for (int A = 1; A < 5; A++) {
            System.out.println("Which student sits at A: " + A);
            String inputNameA = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusA = true;
            } else {
                statusA = false;
            }
            Student newStudent = new Student(inputNameA, statusA);
            rowA.add(newStudent);
        }

        ArrayList<Student> rowB = new ArrayList<Student>();
        boolean statusB = true;
        for (int B = 1; B < 5; B++) {
            System.out.println("Which student sits at B: " + B);
            String inputNameB = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusB = true;
            } else {
                statusB = false;
            }
            Student newStudent = new Student(inputNameB, statusB);
            rowB.add(newStudent);
        }

        ArrayList<Student> rowC = new ArrayList<Student>();
        boolean statusC = true;
        for (int C = 1; C < 5; C++) {
            System.out.println("Which student sits at C: " + C);
            String inputNameC = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusC = true;
            } else {
                statusC = false;
            }
            Student newStudent = new Student(inputNameC, statusC);
            rowC.add(newStudent);
        }

        ArrayList<Student> rowD = new ArrayList<Student>();
        boolean statusD = true;
        for (int D = 1; D < 5; D++) {
            System.out.println("Which student sits at D: " + D);
            String inputNameD = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusD = true;
            } else {
                statusD = false;
            }
            Student newStudent = new Student(inputNameD, statusD);
            rowD.add(newStudent);
        }

        ArrayList<Student> rowE = new ArrayList<Student>();
        boolean statusE = true;
        for (int E = 1; E < 5; E++) {
            System.out.println("Which student sits at E: " + E);
            String inputNameE = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusE = true;
            } else {
                statusE = false;
            }
            Student newStudent = new Student(inputNameE, statusE);
            rowE.add(newStudent);
        }

        ArrayList<Student> rowF = new ArrayList<Student>();
        boolean statusF = true;
        for (int F = 1; F < 5; F++) {
            System.out.println("Which student sits at F: " + F);
            String inputNameF = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusF = true;
            } else {
                statusF = false;
            }
            Student newStudent = new Student(inputNameF, statusF);
            rowF.add(newStudent);
        }

        ArrayList<Student> rowG = new ArrayList<Student>();
        boolean statusG = true;
        for (int G = 1; G < 5; G++) {
            System.out.println("Which student sits at G: " + G);
            String inputNameG = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusG = true;
            } else {
                statusG = false;
            }
            Student newStudent = new Student(inputNameG, statusG);
            rowG.add(newStudent);
        }

        ArrayList<Student> rowH = new ArrayList<Student>();
        boolean statusH = true;
        for (int H = 1; H < 5; H++) {
            System.out.println("Which student sits at H: " + H);
            String inputNameH = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusH = true;
            } else {
                statusH = false;
            }
            Student newStudent = new Student(inputNameH, statusH);
            rowH.add(newStudent);
        }

        ArrayList<Student> rowI = new ArrayList<Student>();
        boolean statusI = true;
        for (int I = 1; I < 5; I++) {
            System.out.println("Which student sits at I: " + I);
            String inputNameI = scanner.nextLine();
            System.out.println("Is the student here today? (P or A)");
            String p_or_a = scanner.nextLine();
            if (p_or_a.equals("P")) {
                statusI = true;
            } else {
                statusI = false;
            }
            Student newStudent = new Student(inputNameI, statusI);
            rowI.add(newStudent);
        }

        Seating_chart seatingChart = new Seating_chart(rowA, rowB, rowC, rowD, rowE, rowF, rowG, rowH, rowI);

        for (int i = 0; i < seatingChart.size(); i++) {
            ArrayList<Student> row = seatingChart.get(i);
            char rowLabel = (char) ('A' + i);
            System.out.print("Row " + rowLabel + ": ");
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j)); // calls Student.toString()
                if (j < row.size() - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }

        ArrayList<Student> absentList = seatingChart.these_are_absent_students();
        for (Student student : absentList) {
            System.out.println(student.getName());
        }

        // Ask which absent students are now present (late)
        ArrayList<Student> lateList = new ArrayList<>();
        for (Student student : absentList) {
            System.out.println("Is " + student.getName() + " here now? (Y or N)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                lateList.add(student);
            }
        }

        System.out.println("\nLate students:");
        for (Student student : lateList) {
            System.out.println(student.getName());
            System.out.println("\nEmail template:");
            System.out.println("This student was marked absent initially, but they arrived late.");
            System.out.println("The student is " + student.getName() + ".");
            System.out.println("Please change their attendance accordingly.");
            System.out.println();
        }

        scanner.close();
    }

}
