public class CarroLuxo extends Carro {
    private int quantidadeAirbags;
    private String gpsIntegrado;
    private String tamPortaMalas;

    public CarroLuxo(String marca, String modelo, String placa, String ano, Double valorLocacao, String gpsIntegrado,
            String tamPortaMalas, int quantidadeAirbags) {
        super(marca, modelo, placa, ano, valorLocacao, 5);
        this.quantidadeAirbags = quantidadeAirbags;
        this.gpsIntegrado = gpsIntegrado;
        this.tamPortaMalas = tamPortaMalas;
    }

    public int getQuantidadeAirbags() {
        return this.quantidadeAirbags;
    }

    public void setQuantidadeAirbags(int quantidadeAirbags) {
        this.quantidadeAirbags = quantidadeAirbags;
    }

    public String getGpsIntegrado() {
        return this.gpsIntegrado;
    }

    public void setGpsIntegrado(String gpsIntegrado) {
        this.gpsIntegrado = gpsIntegrado;
    }

    public String getTamPortaMalas() {
        return this.tamPortaMalas;
    }

    public void setTamPortaMalas(String tamPortaMalas) {
        this.tamPortaMalas = tamPortaMalas;
    }

    @Override
    public double calcularValorAluguel(int numRenovacao) {
        double valorTotal = getValorLocacao();
        if (numRenovacao > 5) {
            valorTotal = (numRenovacao - 5) * getValorMultaRenovacao();
        }
        return valorTotal;
    }

    
    public double getValorMultaRenovacao() {
        return 300.0;
    }

}
