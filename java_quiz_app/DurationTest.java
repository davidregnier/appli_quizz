package java_quiz_app;

import java.util.Scanner;

public class DurationTest {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        long startTime = System.currentTimeMillis();

        clavier.nextLine();

        long endTime = System.currentTimeMillis();

        long timeElapsedInSeconds = (endTime - startTime) / 1000;

        System.out.println("Time elapsed: " + timeElapsedInSeconds);
 
    }
}
