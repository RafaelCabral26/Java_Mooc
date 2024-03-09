import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
       this.jokeManager = jokeManager;
       this.scanner = scanner; 
    }

    public void start() {
        
        while (true) {
            System.out.println("Commands:\n1 - add joke\n2 - draw a joke\n3 - list jokes\nX - stop");  
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            }

            if (command.equals("2")) {
                String joke = jokeManager.drawJoke();
                System.out.println(joke);
            }

            if (command.equals("3")) {
                jokeManager.printJokes();
            }
        }
    }
}
