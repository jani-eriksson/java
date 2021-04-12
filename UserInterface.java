import java.util.Scanner;

public class UserInterface {
    private Scanner scan;

    public UserInterface() {
        this.scan = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("testing phase, write x to escape");
            String command = scan.nextLine();
            
            if (command.equals("x")) {
                break;
            }
        }
    }

}
