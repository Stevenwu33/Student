public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String returnName(){
        return (firstName +" "+ lastName);
    }

    public abstract void displayDetails();




}
