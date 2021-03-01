import java.util.Scanner;

class QuickStart {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Write a value.");
        int arvo = Integer.valueOf(lukija.nextLine());
        System.out.println("Your input was: " + arvo);
    }
}