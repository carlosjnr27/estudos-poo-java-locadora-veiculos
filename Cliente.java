public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private int limiteEmprestimo;
    private int qtdEmprestimo;


    public Cliente(String nome, String telefone, String endereco, int limiteEmprestimo, int qtdEmprestimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.limiteEmprestimo = limiteEmprestimo;
        this.qtdEmprestimo = qtdEmprestimo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQtdEmprestimo(){
        return this.qtdEmprestimo;
    }

    public void setQtdEmprestimo(int qtdEmprestimo){
        this.qtdEmprestimo = qtdEmprestimo;
    }

    public int getLimiteEmprestimo(){
        return this.limiteEmprestimo;
    }

    public int pegarEmprestado(){
        return this.qtdEmprestimo++;
    }
    public int devolver(){
        return this.qtdEmprestimo--;
    }
}
