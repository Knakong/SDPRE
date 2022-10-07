import java.util.Scanner;
public class Objective9Lab3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;


    while(true){
      printMenu();
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

  public static void printMenu(){
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();
                    }

}
