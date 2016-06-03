import java.util.Objects;
import java.util.Scanner;
import java.util.*;

public class MeaningOfLife {
    public static String[] philosophies = new String[] {
            "Platonism", "Aristotellanism", "Cynicism", "Hedonism", "Epicureanism", "Stoicism", "Classical Liberalism",
            "Kantianism", "Nihilism", "Pragmatism", "Theism", " Adamsism", "Jamesism"

    };
       public static String[] beliefs = new String[] {"learn more", "to be good", "be self-sufficient", "have pleasure now",
       "free yourself from pain", "be logical don't suffer", "defend individual liberty", "do as you'd have others do",
       "do anything (life has no meaning)", "bring the most good to humans", "follow God's will", "42","don't be a dick"
       };

    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Would you like to learn about philosophy today?");

        System.out.println("Press y for Yes and n for No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        for (int counter = 0; counter < philosophies.length; counter++) {
            System.out.print(counter + 1 +") " + philosophies[counter] + "\n");
        }


            if (Objects.equals(answer, "y")) {
            System.out.println("Please type the number corresponding to the philosophy that you want to read about");
            Scanner scanner2 = new Scanner(System.in);
            String answer2 = scanner2.nextLine();
                int answer3 = Integer.parseInt(answer2);
                System.out.println(beliefs[answer3 - 1]);
        }

        if (Objects.equals(answer, "n")) {
            System.out.println("Sounds like you're an cynic");
        }


    }



}


