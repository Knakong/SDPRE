public class Objective8Lab2{
  public static void main(String[] args) {
    int sum = 0;
    int count= 1;

    for (count = 0; count < 21; count++){
      sum +=count;
    /*  System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
      //wrote this understand why while() uses different values than for()
      */
    }
    System.out.println(sum);
    //print the sum of all numbers from 1-20.
  }

}
