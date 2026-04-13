import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Attendence round 1");
        Scanner scanner = new Scanner(System.in);
        // make empty arraylist with students
        ArrayList<ArrayList<Student>> seating_chart = new ArrayList<ArrayList<Student>>();

        // user input to put each student into roster
        for (int i = 0; i < 9; i++)
        {
            ArrayList<Student> row = new ArrayList<Student>();
            if (i == 0)
            {
                for (int j = 0; j < 4; j++)
                {
                    System.out.println("Which student sits at A:" +j);
                    String inputName = scanner.nextLine();
                    System.out.println("Is the student here today?");
                    boolean status = scanner.nextLine();
                    Student newStudent = new Student(inputName, status);

                }
            }
            for (int j = 0; j < 4; j++)
            {

                //row.add()
            }
        }


    }
}
