import java.util.Scanner;

public class Main {

    // Metodo che controlla se la lunghezza della stringa è pari
    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    // Metodo che controlla se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test per stringaPariDispari
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
        if (stringaPariDispari(input)) {
            System.out.println("La lunghezza della stringa è pari.");
        } else {
            System.out.println("La lunghezza della stringa è dispari.");
        }

        // Test per annoBisestile
        System.out.print("Inserisci un anno: ");
        int anno = scanner.nextInt();
        if (annoBisestile(anno)) {
            System.out.println("L'anno è bisestile.");
        } else {
            System.out.println("L'anno non è bisestile.");
        }

        scanner.close();
    }
}
