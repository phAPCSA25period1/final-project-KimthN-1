import java.util.ArrayList;

// in main method make rowA and blah blah with four students
//add to seating chart constructor
//every student already present, make another student constructor with status already present, just mark those are absent
//then ask 2nd round are they still absent
//array lists for each row
public class Seating_chart {
    private ArrayList<ArrayList<Student>> rows;

    /**
     * Creates a seating chart from nine rows of students.
     *
     * @param RowA students in row A
     * @param RowB students in row B
     * @param RowC students in row C
     * @param RowD students in row D
     * @param RowE students in row E
     * @param RowF students in row F
     * @param RowG students in row G
     * @param RowH students in row H
     * @param RowI students in row I
     */
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

    /**
     * Returns the number of rows in this seating chart.
     *
     * @return the row count
     */
    public int size() {
        return rows.size();
    }

    /**
     * Returns the student list for the requested row index.
     *
     * @param index the zero-based row index
     * @return the students in the row
     */
    public ArrayList<Student> get(int index) {
        return rows.get(index);
    }

    /**
     * Finds all absent students in this seating chart.
     *
     * @return a list of absent students
     */
    public ArrayList<Student> these_are_absent_students() {
        return these_are_absent_students(rows);
    }

    // method that says which students are absent
    /**
     * Finds all absent students in the given seating chart.
     *
     * @param seating_chart the seating arrangement to search
     * @return a list of absent students from the provided seating chart
     */
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
