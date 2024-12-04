//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Tarlan", "Faal", 20, "Law");
        Student student2 = new Student("Sandy", "Karne", 20, "Pre-Med" );
        student.displayDetails();
        student.subject();
        System.out.println();
        student2.displayDetails();
        student2.subject();




    }
}