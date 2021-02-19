import java.util.Scanner;

abstract class Operacao {
    public abstract double efetuarOperacao (double x, double y);
}

class Soma extends Operacao {
    public double efetuarOperacao (double x, double y) {
        return x + y;
    }
}

class Subtracao extends Operacao {
    public double efetuarOperacao (double x, double y) {
        return x - y;
    }
}

class Multiplicacao extends Operacao {
    public double efetuarOperacao (double x, double y) {
        return x * y;
    }
}

class Divisao extends Operacao {
    public double efetuarOperacao (double x, double y) {
        if (y == 0) {
            System.out.print("A operação de divisão não é possível. ");
            return 0;
        }
        else {
            return x / y;
        }
    }
}

class Program {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de x e y:");
        while (!scanner.hasNextDouble()) {
            scanner.next();
        }
        double x = scanner.nextDouble();
        while (!scanner.hasNextDouble()) {
            scanner.next();
        }
        double y = scanner.nextDouble();

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println("Soma: " + soma.efetuarOperacao(x, y));
        System.out.println("Subtracao: " + subtracao.efetuarOperacao(x, y));
        System.out.println("Multiplicacao: " + multiplicacao.efetuarOperacao(x, y));
        System.out.println("Divisao: " + divisao.efetuarOperacao(x, y));
    }
}
