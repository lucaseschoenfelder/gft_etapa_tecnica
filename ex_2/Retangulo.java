class Retangulo implements AreaCalculavel {
    private double lado, altura;

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double calculaArea () {
        return this.lado * this.altura;
    }
    public String getDimensoes () {
        return "lado = " + this.lado + ", altura = " + this.altura;
    }
}
