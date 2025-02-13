import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your adventure!");
        System.out.println("You stand at a crossroads. Do you want to go LEFT or RIGHT?");
        System.out.print("(left/right): ");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("left")) {
            System.out.println("You go left and encounter a river. Do you want to CROSS it or follow the PATH?");
            System.out.print("(cross/path): ");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("cross")) {
                System.out.println("You swim across the river, but the current is strong! You barely make it to the other side and find a treasure chest!");
            } else {
                System.out.println("You follow the path and meet an old sage who gives you a valuable map.");
            }
        } else if (choice.equals("right")) {
            System.out.println("You go right and enter a dark forest. Suddenly, you hear a growl. Do you want to RUN or HIDE?");
            System.out.print("(run/hide): ");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("run")) {
                System.out.println("You run as fast as you can and barely escape a wild animal!");
            } else {
                System.out.println("You hide behind a tree. The animal doesn’t notice you and moves on. You can continue safely.");
            }
        } else {
            System.out.println("You hesitate and an eagle steals your lunch. Adventure over!");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
