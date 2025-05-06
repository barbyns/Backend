package Switch;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero tra 0 e 3:");
        int scelta = scanner.nextInt();

        switch(scelta){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore: numero fuori dal range 0-3");
        }
    }
}
