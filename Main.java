import java.util.Scanner;
/**
 * Tells the user which of their two numbers are larger
 * @author Thomas Quigley
 */
public class Main {

 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask the user their numbers and store their values
    System.out.println("Please enter an integer:");
    int userInt1 = input.nextInt();
    System.out.println("Please enter another integer:");
    int userInt2 = input.nextInt();

    // determines which is larger and tell the user
    if (userInt1 > userInt2) {
      System.out.println("The biggest number is " + userInt1 + ".");
    } else if (userInt1 < userInt2) {
      System.out.println("The biggest number is " + userInt2 + ".");
    } else {
      System.out.println("There is no biggest number.");
    }
    
  }
}
