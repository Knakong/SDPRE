import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;


    System.out.print("Please give me a number: ");
    //prints line to request for first number
    num1 = kb.nextDouble();

    //keyboard input to save value of double num1

    System.out.print("Please give me another number: ");
    //prints line to request second number

    num2 = kb.nextDouble();

    //saved the value entered on keyboard to num2

		while (keepGoing) {
			printMenu();
			System.out.println("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
        case 1:
        double sum = findSum(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);
        break;

        case 2:
        double avg = findAverage(num1, num2);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
        break;

        case 3:
        double tax = calcTax(num1, num2);
        System.out.println("The amount in tax to be collected from the purchase of " + num1 + " and " + num2 + " is: " + tax);
        break;

        case 4:
        System.out.println("You've chosen to quit");
        keepGoing = false; //makes this boolean false and shutdown loop
        break;

        case 5:
        System.out.println("Invalid entry. Please try again");
        break;
        //expected outcome for the above line to print if 5 is entered, no other invalid number message

		}


	}



  kb.close(); //close keyboard if outside switch

  }

  //have to make sure that these methods are outside the main method curly brackets
  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. Exit            |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }

  public static double findSum(double num1, double num2) { //findSum method
    double sum = num1 + num2;
    return sum;
  }
  public static double findAverage(double num1, double num2) { //findAverage Method
    //method that returns a double

    double average = (num1 + num2) / 2;
    //the sum of 2 twos divided 2 is the average
    return average;
  }

  public static double calcTax(double num1, double num2){ //method to calcTax
    double tax = (num1 + num2) * .0831;
    return tax;

  }
}
