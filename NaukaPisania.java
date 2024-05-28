import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class NaukaPisania {
    public static void main(String[] args) {
    
        try (Scanner scanner = new Scanner(System.in)) {
            
            ArrayList<String> zdania = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("zdania.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    zdania.add(line);
                }
            } catch (IOException e) {
                System.err.println("Błąd podczas wczytywania pliku!");
                e.printStackTrace();
                return;
            }

            
            System.out.println("Zdania:");
            for (String sentence : zdania) {
                System.out.println(sentence);
            }

            boolean continuePlaying = true;
            while (continuePlaying) {
                
                Random random = new Random();
                String randomSentence = zdania.get(random.nextInt(zdania.size()));
                System.out.println("\nPrzepisz to zdanie:");
                System.out.println("\u001B[32m" + randomSentence + "\u001B[0m");

                
                System.out.print("Wprowadź zdanie : ");
                long czas_start = System.currentTimeMillis();
                String userTypedSentence = scanner.nextLine();
                long czas_koniec = System.currentTimeMillis();

                
                int errors = 0;
                for (int i = 0; i < randomSentence.length() && i < userTypedSentence.length(); i++) {
                    if (randomSentence.charAt(i) != userTypedSentence.charAt(i)) {
                        errors++;
                    }
                }

                
                System.out.print("\nWpisałeś: ");
                for (int i = 0; i < userTypedSentence.length(); i++) {
                    if (i >= randomSentence.length() || randomSentence.charAt(i) != userTypedSentence.charAt(i)) {
                        System.out.print("\u001B[31m" + userTypedSentence.charAt(i) + "\u001B[0m");
                    } else {
                        System.out.print(userTypedSentence.charAt(i));
                    }
                }

                
                double errorPercentage = (double) errors / (double) randomSentence.length() * 100.0;
                System.out.printf("\nProcent błędów: %.2f%%\n", errorPercentage);

                
                long miniony_czas = czas_koniec - czas_start;
                System.out.printf("Czas wprowadzania: %d ms\n", miniony_czas);

               
                System.out.print("Czy chcesz spróbować ponownie? (T/N): ");
                String tryAgain = scanner.nextLine();
                if (!tryAgain.equalsIgnoreCase("T")) {
                    continuePlaying = false;
                }
            }
        }
    }
}
