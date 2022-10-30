import java.util.Scanner;

public class Ballistic {
    public static void main(String[] args) {
        // constants
        final double ERDBESCHLEUNIGUNG = 9.81;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Start Position/ Höhe x0
        int x0 = scanner.nextInt();

        // Geschwindigkeit v0
        int v0 = scanner.nextInt();

        // Zeit t
        double t = scanner.nextDouble();

        // Formel
        double result = (x0 + v0 * t) - ((ERDBESCHLEUNIGUNG*(Math.pow(t, 2))) / 2);

        // Output
        System.out.println(result);

    }
}
