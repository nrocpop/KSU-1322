import java.util.Random;

//Class: CSE 1322L
//Section: 01
//Term: Spring 2019
//Instructor:
//Name: Thomas Robinson
//Lab#:	1
public class Arrays {
  static int findLargest(int[] Array){
      int Large = Array[0];
      for (int i = 1; i < Array.length; i++) {
          if(Array[i] > Large){
              Large = Array[i];
          }
      }
      return Large;
  }
  static void randomFill(int[] Array,Random random){
      for (int i = 0; i < Array.length; i++) {
          Array[i] = random.nextInt(101) - 100;
      }
  }

    public static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + ", ");
        }
    }


        public static void main (String[]args){
            Random rand = new Random();
            int a,b;
            int[] nums = {1, 4, 13, 43, -25, 17, 22, -37, 29};
            int[] data = new int[20];
            randomFill(data,rand);
            a = findLargest(nums);
            b = findLargest(data);
            System.out.println("Largest number of nums is " + a);
            System.out.println("Largest number of data " + b);
            System.out.println("sum of Largest numbers is " + (a+b));

            printArray(data);
        }
    }


