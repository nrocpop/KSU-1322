
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        // Create an array of Tests Objects and populate the array with
        Tests[] studentGrades = new Tests[10];
        //studentGrades[0] = new Tests("Bob","Marley",rand.nextFloat()*100.00f,rand.nextFloat()*100.00f,rand.nextFloat()*100.00f,rand.nextFloat()*100.00f,rand.nextFloat()*100.00f);

        for (int i = 0; i < studentGrades.length ; i++){
           studentGrades[i] = new Tests();
        }

        //Applies user input to each of the tests object in the studentGrades array.
       for (int i = 0; i < studentGrades.length ; i++) {
            System.out.print("Enter First Name: ");
            studentGrades[i].setFirstName(scan.next());
            System.out.print("Enter Last Name: ");
            studentGrades[i].setLastName(scan.next());
            System.out.print("Enter Grade 1: ");
            studentGrades[i].setGrades(scan.nextFloat(),0);
            System.out.print("Enter Grade 2: ");
            studentGrades[i].setGrades(scan.nextFloat(),1);
            System.out.print("Enter Grade 3: ");
            studentGrades[i].setGrades(scan.nextFloat(),2);
            System.out.print("Enter Grade 4: ");
            studentGrades[i].setGrades(scan.nextFloat(),3);
            System.out.print("Enter Grade 5: ");
            studentGrades[i].setGrades(scan.nextFloat(),4);
            studentGrades[i].setAverage();
            studentGrades[i].setLetterGrade();
        }

        //Print information of each object in the studentGrades array.
        System.out.println("First Name"+"    Last Name"+"    Test 1"+"     Test 2"+"    Test 3"+
                "    Test 4"+"    Test 5"+"    Average"+"    Letter Grade");
        for (int i = 0; i < studentGrades.length ; i++) {
            System.out.println(studentGrades[i].toString());
        }

    }
}
