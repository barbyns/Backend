import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Inserisci una stringa (scrivi ':q' per uscire):");

        while (true) {
            input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Uscita dal programma.");
                break;
            }

            // Suddivide la stringa in caratteri separati da virgola
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                result.append(input.charAt(i));
                if (i < input.length() - 1) {
                    result.append(",");
                }
            }

            System.out.println("Output: " + result.toString());
        }

        scanner.close();
    }
}
