public class Objective8Lab3{
  public static void main(String[] args) {
    int counter;
    for (counter = 1; counter < 21; counter++){
      //loops 20 times from 1 to 20.
      if (counter %2 == 0){ //no remainder
        System.out.println(counter +" is even"); //prints number is even
      }
        else{ //remainder
          System.out.println(counter + " is odd"); //prints number is odd
        }
    }

  }
}
