public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age, int courseYear) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public abstract boolean canApplyAsTutor();
    public abstract boolean canApplyAsHead();
}
