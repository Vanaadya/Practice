import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int square = (int)Math.round(Math.pow(x,2));

        System.out.println(square);

    }
}
