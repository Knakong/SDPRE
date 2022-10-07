public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while (counter <= 20) { //will only loop while counter is 20 or less
      if (counter %2 == 0) { //can be divide by 2 evenly
        //for the even numbers
        System.out.println(counter + " is even");
          //prints counter value is even
        counter++; //adds 1 to the value of counter
                    }

          else { //remainder does not eqaul zero
            // for odd numbers
              System.out.println(counter + " is odd");
                //prints counter value is odd
              counter++;  //adds 1 to value of counter
                      }
            }
      }
}
