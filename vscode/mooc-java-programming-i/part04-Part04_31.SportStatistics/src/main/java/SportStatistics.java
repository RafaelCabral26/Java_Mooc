
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int win = 0;
        int loss = 0;
        try (Scanner sFile = new Scanner(Paths.get(file))) {
            while (sFile.hasNextLine()) {
                String[] arrFile = sFile.nextLine().split(",");
                int score1 = Integer.valueOf(arrFile[2]);
                int score2 = Integer.valueOf(arrFile[3]);
                if (arrFile[0].equals(team) || arrFile[1].equals(team)) {
                    games++;
                    if (arrFile[0].equals(team)) {
                        if (score1 > score2) {
                            win++;
                        } else {
                            loss++;
                        }

                    } else if (arrFile[1].equals(team)) {
                        if (score2 > score1) {
                            win++;
                        } else {
                            loss++;
                        }

                    }
                }

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }

}
