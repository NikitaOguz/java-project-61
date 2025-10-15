package hexlet.code;
public class App {
    public static void main( String[] args) {
        System.out.println("Please enter the game number and press Enter:");
        int number = 0;
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
