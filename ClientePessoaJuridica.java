public class ClientePessoaJuridica extends Cliente {
    private String cnpj;

    public ClientePessoaJuridica(String nome, String telefone, String endereco, int limiteEmprestimo, int qtdRenovacoes,
            String cnpj) {
        super(nome, telefone, endereco, limiteEmprestimo, qtdRenovacoes);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
