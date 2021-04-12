import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        while (true) {
            String command = scan.nextLine();
            if (command.equals("x")) {
                break;
            }
        }

        scan.close();
    }
    
}
