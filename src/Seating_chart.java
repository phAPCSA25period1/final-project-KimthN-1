import java.util.ArrayList;

// in main method make rowA and blah blah with four students
//add to seating chart constructor
//every student already present, make another student constructor with status already present, just mark those are absent
//then ask 2nd round are they still absent
//array lists for each row
public class Seating_chart {
    private ArrayList<ArrayList<Student>> rows;

    // constructor
    Seating_chart(ArrayList<Student> RowA, ArrayList<Student> RowB, ArrayList<Student> RowC, ArrayList<Student> RowD,
            ArrayList<Student> RowE, ArrayList<Student> RowF, ArrayList<Student> RowG, ArrayList<Student> RowH,
            ArrayList<Student> RowI) {
        rows = new ArrayList<>();
        rows.add(RowA);
        rows.add(RowB);
        rows.add(RowC);
        rows.add(RowD);
        rows.add(RowE);
        rows.add(RowF);
        rows.add(RowG);
        rows.add(RowH);
        rows.add(RowI);
    }

    public int size() {
        return rows.size();
    }

    public ArrayList<Student> get(int index) {
        return rows.get(index);
    }

    public ArrayList<Student> these_are_absent_students() {
        return these_are_absent_students(rows);
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
