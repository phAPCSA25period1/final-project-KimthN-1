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

    //constructor
    Seating_chart(ArrayList<Student> RowA, ArrayList<Student> RowB, ArrayList<Student> RowC, ArrayList<Student> RowD, ArrayList<Student> RowE, ArrayList<Student> RowF, ArrayList<Student> RowG, ArrayList<Student> RowH, ArrayList<Student> RowI)
    {
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

    //toString as 2d array

}
