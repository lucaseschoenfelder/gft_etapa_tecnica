class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea () {
        return this.raio * this.raio * Math.PI;
    }

    public String getDimensoes () {
        return "raio = " + this.raio;
    }
}
