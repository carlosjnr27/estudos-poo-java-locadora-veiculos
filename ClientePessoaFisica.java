public class ClientePessoaFisica extends Cliente {
    private String cpf;
    

    public ClientePessoaFisica(String nome, String telefone, String endereco, int qtdRenovacoes, String cpf) {
        super(nome, telefone, endereco, 1, qtdRenovacoes);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
