import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaration Min
        System.out.print("Augenzahl Minimum: ");
        int min = scanner.nextInt();

        // Declaration Max
        System.out.print("Augenzahl Maximum: ");
        int max = scanner.nextInt();

        // Randomizer
        int randomNumber = (int)Math.round(Math.random() * max);
        System.out.println(randomNumber);

        // muss noch verbessert werden, sodass man keine 0 als Min eingeben oder
        // ausgegeben werden kann

    }
}