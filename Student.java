public class Student extends Person{
    private int courseYear;

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public Student(String firstName, String lastName, int courseYear, int age) {
        super(firstName, lastName, age, courseYear);



    }

    @Override
    public boolean canApplyAsTutor() {
        return false;
        if (courseYear >=3){
        } else 


    @Override
    public boolean canApplyAsHead() {
        return false;
    }
}
