import java.util.Scanner;
public class Objective9Lab4{
  public static void main(String[] args) {

    Scanner kb = new Scanner (System.in); //declares kb as new scanner object

    double num1, num2; //declares num1, num2 as doubles

    System.out.print("Please give me a number: ");
    //prints line to request for first number
    num1 = kb.nextDouble();

    //keyboard input to save value of double num1

    System.out.print("Please give me another number: ");
    //prints line to request second number

    num2 = kb.nextDouble();

    //saved the value entered on keyboard to num2

    double answer = findAverage(num1, num2);
    //uses method to return average value from findAverage() to answer variable

    System.out.println("The average of " + num1 + " and " + num2 + " is " + answer);
    //prints both numbers and the average of both numbers

    kb.close();
  }
  public static double findAverage(double num1, double num2){
    //method that returns a double

    double average = (num1 + num2) / 2;
    //the sum of 2 twos divided 2 is the average
    return average;
  }

}
