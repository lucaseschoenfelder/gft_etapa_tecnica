import java.util.Scanner;

public class Program {
    static void printaErro (String erro) {
        System.out.println(erro);
        System.exit(0);
    }

    static void valida (int mult, int inicio, int fim) {
        if (mult < 0 || mult > 3000) {
            printaErro("O multiplicador não pode ser negativo e não pode ser maior que 3000.");
        }
        if (inicio < 0 || inicio > 3000) {
            printaErro("O início do intervalo não pode ser negativo e não pode ser maior que 3000.");
        }
        if (fim < 0 || fim > 3000) {
            printaErro("O fim do intervalo não pode ser negativo e não pode ser maior que 3000.");
        }

        int intervalo = fim - inicio;
        if (intervalo < 0) {
            printaErro("O início do intervalo deve ser menor que seu fim.");
        }
        if (intervalo > 10 ) {
            printaErro("O intervalo não pode ter uma diferença maior que 10");
        }

    }

    static int multiplica (int a, int b) {
        return a * b;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Multiplicando:");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int multiplicando = scanner.nextInt();

        System.out.print("Início do intervalo:");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int intervalo_inicio = scanner.nextInt();

        System.out.print("Fim do intervalo:");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int intervalo_fim = scanner.nextInt();

        valida(multiplicando, intervalo_inicio, intervalo_fim);

        for (int i = intervalo_inicio; i <= intervalo_fim; i++) {
            System.out.println(multiplicando + " x " + i + " = " + multiplica(multiplicando, i));
        }
    }
}
