public class Objective3Lab2{
  public static void main(String[] args) {
    //declares variables
    double side1=10, side2=8, hypotenus;
    //value of hypotenus is the square root of the sum of (side1 and side2)^2
    hypotenus =Math.sqrt(side1*side1+side2*side2);
    //prints the expected outcome
    System.out.println("The hypotenus of a right triange with sides of "+ side1
    + " and " + side2 + " is " + hypotenus);
  }
}
