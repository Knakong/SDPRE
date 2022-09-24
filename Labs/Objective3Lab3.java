public class Objective3Lab3{
  public static void main(String[] args) {
    //declares variables
    int first, second, third, sum;
    //declares values to have random number from 1-6
    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6 );
    //decares sum to have the value of the sum of the three numbers
    sum = first+second+third;
    System.out.println(first + " + " + second + " + " + third + " = " + sum);
  }
}
