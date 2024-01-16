public class CarroSUV extends Carro {
    private String tamPortaMalas;
    private String tipoTracao;
    private String tipoCombustivel;

    public CarroSUV(String marca, String modelo, String placa, String ano, Double valorLocacao, String tamPortaMalas,
            String tipoTracao, String tipoCombustivel) {
        super(marca, modelo, placa, ano, valorLocacao, 3);
        this.tamPortaMalas = tamPortaMalas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoTracao = tipoTracao;
    }

    public String getTamPortaMalas() {
        return this.tamPortaMalas;
    }

    public void setTamPortaMalas(String tamPortaMalas) {
        this.tamPortaMalas = tamPortaMalas;
    }

    public String getTipoTracao() {
        return this.tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public double calcularValorAluguel(int numRenovacao) {
        double valorTotal = getValorLocacao();
        if (numRenovacao > 3) {
            valorTotal = (numRenovacao - 3) * getValorMultaRenovacao();
        }
        return valorTotal;
    }

    public double getValorMultaRenovacao() {
        return 200.0;
    }

}
