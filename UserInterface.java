import java.util.Scanner;

public class UserInterface {
    private Scanner scan;

    public UserInterface() {
        this.scan = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            startMenu();
            String command = scan.nextLine().toUpperCase();
            commands(command);
            if (command.equals("END")) {
                break;
            }
        }
    }

    public void startMenu() {
        System.out.println("  -  -  -  - Commands -  -  -  -");
        System.out.println(" | Start  -->  in order to begin |");
        System.out.println(" |  End   -->  close the program |");
        System.out.println("  -  -  -  -  -  -  -  -  -  -  -");
    }

    public void commands(String command) {
        if (!(command.equals("START") || command.equals("END"))) {
            System.out.println("Incorrect input. Please, try again. \n");
        }
        if (command.equals("START")) {
            System.out.println("Starting...");
        }
        if (command.equals("END")) {
            System.out.println("Closing...");
        }
        
    }

}
