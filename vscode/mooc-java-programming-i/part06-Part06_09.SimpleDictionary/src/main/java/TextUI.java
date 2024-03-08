import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scan = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String next = scan.nextLine();
            if (next.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (next.equals("add")) {
                System.out.println("Word:");
                String word = scan.nextLine();
                System.out.println("Translation:");
                String translation = scan.nextLine();
                dictionary.add(word, translation);
                continue;
            }
            if (next.equals("search")) {
                System.out.println("To be translated:");
                String toBe = scan.nextLine();
                if (toBe.equals("end")) {
                    break;
                }
                String translated = dictionary.translate(toBe);
                if (translated.equals("end")) {
                    break;
                }
                if (translated.isEmpty()) {
                    System.out.println("Word (" + toBe + ") was not found");
                    continue;
                }
                System.out.println("Translation: " + translated);
                continue;
            }
            System.out.println("Unknown command");
        }
    }

}
