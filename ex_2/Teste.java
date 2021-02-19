class Teste {
    public static void main (String[] args) {
        Quadrado quadrado = new Quadrado(4);
        Retangulo retangulo = new Retangulo(3, 7);
        Circulo circulo = new Circulo(2);

        System.out.println("Area do Quadrado (" + quadrado.getDimensoes() + ") = " + quadrado.calculaArea());
        System.out.println("Area do Retangulo (" + retangulo.getDimensoes() + ") = " + retangulo.calculaArea());
        System.out.println("Area do Circulo (" + circulo.getDimensoes() + ") = " + circulo.calculaArea());
    }
}
