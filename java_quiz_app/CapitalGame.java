import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

package java_quiz_app;

public class CapitalGame {
    final int NUMBER_OF_QUESTIONS = 5;
    int score = 0, index;
    String pays, capitale, userAnswer;
    char replayAnswer;

    ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();

    String[] [] data = getData(); // stock une valeur dans un tableau a 2 dimension ou un tableau de tableau

    Scanner clavier = new Scanner(System.in);

    do {
        indexesAlreadyTaken.clear();

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            // choisi un pays aléatoire
            do {
                Random random = new Random();
                index = random.nextInt(data.length);

            } while(indexesAlreadyTaken.contains(index));

            indexesAlreadyTaken.add(index);

            pays = data[index][0];
            capitale = data[index][1];

            System.out.printf("Quelle est la capitale de ce pays: %s?\n",
            pays);
            userAnswer = clavier.nextLine();

            if(capitale.equalsIgnoreCase(userAnswer)){
                System.out.println("Bonne réponse!");
                score++;
            } else {
                System.out.printf("Mauvaise réponse. Il fallait répondre %s. \n",
                capitale);
            }
        }
        System.out.printf("C'est terminé. << Score: %d/%d >> \n\n", score,
         NUMBER_OF_QUESTIONS);

         do {
            System.out.println("Voulez-vous rejouer, (O/N)");

            replayAnswer = clavier.nextLine().toLowerCase().charAt(0);

         } while (replayAnswer != 'o' && replayAnswer != 'n');

    } while (replayAnswer == 'o');

    System.out.println("\nBye Bye...");
    System.out.println("Appuyez sur la touche <Entree> pour quitter!");
    clavier.nextLine();
    clavier.close(); 
}
    static  String[][] getData{
        String[][] data = { { "Senegal", "Dakar"}, {"France", "Paris"},
                {""}

        }
        
    }
