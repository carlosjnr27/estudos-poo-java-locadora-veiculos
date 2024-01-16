public abstract class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private Double valorLocacao;
    private boolean disponivel;
    private int cotaRenovacao;
    private double valorMultaRenovacao;

    public Carro(String marca, String modelo, String placa, String ano, Double valorLocacao, int cotaRenovacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.disponivel = true;
        this.cotaRenovacao = cotaRenovacao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getValorLocacao() {
        return this.valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public abstract double calcularValorAluguel(int numRenovacao);

    public double getValorMultaRenovacao(){
        return valorMultaRenovacao;
    }

    public int getCotaRenovacao(){
        return this.cotaRenovacao;
    }

    public boolean emprestar(){
        return this.disponivel = false;
    }

    public boolean devolver(){
        return this.disponivel = true;
    }
}
