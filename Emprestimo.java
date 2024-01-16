public class Emprestimo {
    private Cliente cliente;
    private Carro carro;
    private int numRenovacao;
    private double valorTotal;


    public Emprestimo(Cliente cliente, Carro carro)throws VeiculoException, EmprestimoException {
        if(carro.isDisponivel()){
            if(cliente.getLimiteEmprestimo() > cliente.getQtdEmprestimo()){
                this.cliente = cliente;
                this.carro = carro;
                this.cliente.pegarEmprestado();
                this.carro.emprestar();
                this.numRenovacao = 0;
                this.valorTotal = 0;
            }else{
                throw new EmprestimoException("");
            }
        }else{
            throw new VeiculoException("");
        }
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getNumRenovacao() {
        return this.numRenovacao;
    }

    public void renovarEmprestimo() {
        numRenovacao ++;
    }
    
    public void devolverCarro() {
        carro.isDisponivel();
        System.out.println("Carro devolvido por " + cliente.getNome());
        System.out.println("Valor total do empréstimo: R$ " + this.calcularValorTotalEmprestimo());
    }
    
    private double calcularValorTotalEmprestimo() {
        this.valorTotal = carro.getValorLocacao();
        int numRenovacoesExcedentes = numRenovacao - carro.getCotaRenovacao();
        if (numRenovacoesExcedentes > 0) {
            double valorMultaRenovacao = carro.getValorMultaRenovacao();
            this.valorTotal += numRenovacoesExcedentes * valorMultaRenovacao;
        }
        return valorTotal;
    }
    
}
    




