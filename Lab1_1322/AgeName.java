
//Class: CSE 1322L
//Section: 01
//Term: Spring 2019
//Instructor:
//Name: Thomas Robinson
//Lab#:	1
import java.util.Scanner;
public class AgeName {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int age;
        String name;

        System.out.println("Please enter your name.");
        name = scan.nextLine();
        System.out.println("\nPlease enter your age.");
        age = scan.nextInt();
        System.out.println( name + " is " + age + " Years old.");



    }

}
