import java.util.ArrayList;

// in main method make rowA and blah blah with four students
//add to seating chart constructor
//every student already present, make another student constructor with status already present, just mark those are absent
//then ask 2nd round are they still absent
//array lists for each row
public class Seating_chart {
    private ArrayList<Student> RowA;
    private ArrayList<Student> RowB;
    private ArrayList<Student> RowC;
    private ArrayList<Student> RowD;
    private ArrayList<Student> RowE;
    private ArrayList<Student> RowF;
    private ArrayList<Student> RowG;
    private ArrayList<Student> RowH;
    private ArrayList<Student> RowI;

    // constructor
    Seating_chart(ArrayList<Student> RowA, ArrayList<Student> RowB, ArrayList<Student> RowC, ArrayList<Student> RowD,
            ArrayList<Student> RowE, ArrayList<Student> RowF, ArrayList<Student> RowG, ArrayList<Student> RowH,
            ArrayList<Student> RowI) {
        this.RowA = RowA;
        this.RowB = RowB;
        this.RowC = RowC;
        this.RowD = RowD;
        this.RowE = RowE;
        this.RowF = RowF;
        this.RowG = RowG;
        this.RowH = RowH;
        this.RowI = RowI;
    }

    // method that says which students are absent
    public ArrayList<Student> these_are_absent_students(ArrayList<ArrayList<Student>> seating_chart) {
        System.out.println("These students are absent today");
        ArrayList<Student> absentList = new ArrayList<>();
        for (int i = 0; i < seating_chart.size(); i++) {
            for (int j = 0; j < seating_chart.get(i).size(); j++) {
                if (!seating_chart.get(i).get(j).getPresent()) {
                    Student absent_student = seating_chart.get(i).get(j);
                    absentList.add(absent_student);
                }
            }
        }
        return absentList;
    }

    // are they late or absent?
    // public

    // toString as 2d array

    // make user input rows
    // make seating chart as is
    // make absentList
    // print come back before the end of the period
    // are these people still absent method, no or yes then change presentstatus
    // these people are late method, email message

}
