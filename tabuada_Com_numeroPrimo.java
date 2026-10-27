import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int lerInt() {
        while (true) {
            try {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros inteiros!");
                sc.nextLine();
            }
        }
    }

    public static void tabuada(int num, int lim) {
        for (int i = 1; i <= lim; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        int num = lerInt();

        System.out.println("Digite um numero limite: ");
        int lim = lerInt();

        if (lim < 1) {
            System.out.println("O limite deve ser pelo menos 1.");
        } else {
            tabuada(num, lim);
        }

        if (ehPrimo(num)) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }
}