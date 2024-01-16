public class CarroPopular extends Carro {
    private boolean arcondicionado;

    public CarroPopular(String marca, String modelo, String placa, String ano, Double valorLocacao,
            Boolean arcondicionado) {
        super(marca, modelo, placa, ano, valorLocacao, 1);
        this.arcondicionado = arcondicionado;
    }

    public boolean isArcondicionado() {
        return this.arcondicionado;
    }

    @Override
    public double calcularValorAluguel(int numRenovacao) {
        double valorTotal = getValorLocacao();
        if (numRenovacao > 1) {
            valorTotal += (numRenovacao - 1) * getValorMultaRenovacao();
        }
        return valorTotal;
    }

    public double getValorMultaRenovacao() {
        return 100.0;
    }
}
