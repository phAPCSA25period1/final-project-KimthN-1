public class Student
{
    private String name;
    private boolean present;

    public Student(String name)
    {
        this.name = name;
    }

    public Student(String name, boolean present)
    {
        this.name = name;
        this.present = present;
    }

    public String getName() {
        return name;
    }

    public boolean getPresent()
    {
        return present;
    }



}
