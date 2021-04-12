import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface();

        while (true) {
            System.out.println("  -  -  -  - Commands -  -  -  -");
            System.out.println(" | Start  -->  in order to begin |");
            System.out.println(" |  End   -->  close the program |");
            System.out.println("  -  -  -  -  -  -  -  -  -  -  -");
            String command = scan.nextLine().toUpperCase();
            if (!(command.equals("START") || command.equals("END"))) {
                System.out.println("Incorrect input. Please, try again. \n");
                continue;
            }
            if (command.equals("START")) {
                ui.start();
            }
            if (command.equals("END")) {
                System.out.println("Closing...");
                break;
            }
        }
        scan.close();
    }
    
}
