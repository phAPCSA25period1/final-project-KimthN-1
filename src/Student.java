public class Student {
    private String name;
    private boolean present;

    /**
     * Constructs a student with only a name.
     * The attendance status defaults to false if not specified.
     *
     * @param name the student's name
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Constructs a student with a name and attendance status.
     *
     * @param name    the student's name
     * @param present true if the student is present, false otherwise
     */
    public Student(String name, boolean present) {
        this.name = name;
        this.present = present;
    }

    /**
     * Returns the student's name.
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Returns whether the student is present.
     *
     * @return true if the student is present, false if absent
     */
    public boolean getPresent() {
        return present;
    }

    /**
     * Returns a string representation of the student, including attendance status.
     *
     * @return the student name and presence status
     */
    @Override
    public String toString() {
        return name + " (" + (present ? "Present" : "Absent") + ")";
    }

}
