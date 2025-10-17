package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main( String[] args) {
        System.out.println("Please enter the game number and press Enter:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number)
        {
            case 1 :
                System.out.println("Welcome to the Brain Games!");
                Cli.main(args);
                break;
            case 0:
                return;
        }
    }
}
