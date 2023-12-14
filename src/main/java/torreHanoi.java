import java.util.Scanner;

public class torreHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de discos: ");
        int numeroDiscos = scanner.nextInt();

        int movimentos = resolverTorreHanoi(numeroDiscos);

        System.out.println("Número de movimentos necessários: " + movimentos);

        scanner.close();
    }

    static int resolverTorreHanoi(int n) {
        return moverDiscos(n, "A", "C", "B");
    }

    static int moverDiscos(int n, String origem, String destino, String auxiliar) {
        int movimentos = 0;
        if (n > 0) {
            movimentos += moverDiscos(n - 1, origem, auxiliar, destino);

            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
            movimentos++;

            movimentos += moverDiscos(n - 1, auxiliar, destino, origem);
        }
        return movimentos;
    }
}
