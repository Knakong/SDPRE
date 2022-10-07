import java.util.Scanner; //imports Scanner

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();


        if (selection == 1){
          //if 2 is entered

          System.out.println("Hello Human"); //prints Hello Human

            }

        if (selection == 2){
          //if 2 is entered
          System.out.println("Apples, Bananas, Coconuts"); //prints food list

              }

        if (selection == 3){
          //if 3 is entered
          System.out.println("Goodbye"); //prints Goodbye
          scanner.close(); //I'm thinking is the best place to close the scanner
          break; //ends loop

            }

            else {
              //does nothing if int other than 1,2,3 entered;
              //breaks if !=int is entered

        }

    }

  }
}
