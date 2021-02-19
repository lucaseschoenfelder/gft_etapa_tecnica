import java.util.Scanner;

interface Operacao {
    public double efetuarOperacao(double x, double y);
}

class Soma implements Operacao {
    public double efetuarOperacao (double x, double y) {
        return x + y;
    }
}

class Subtracao implements Operacao {
    public double efetuarOperacao (double x, double y) {
        return x - y;
    }
}

class Multiplicacao implements Operacao {
    public double efetuarOperacao (double x, double y) {
        return x * y;
    }
}

class Divisao implements Operacao {
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

class Calculadora {
    double calcula (Operacao op, double x, double y) {
        return op.efetuarOperacao(x, y);
    }
}

class VersaoComInterface {
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

        Calculadora calculadora = new Calculadora();

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println("Soma: " + calculadora.calcula(soma, x, y));
        System.out.println("Subtracao: " + calculadora.calcula(subtracao, x, y));
        System.out.println("Multiplicacao: " + calculadora.calcula(multiplicacao, x, y));
        System.out.println("Divisao: " + calculadora.calcula(divisao, x, y));
    }
}
