import java.util.ArrayList;

public class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Carro> carro;
    private ArrayList<Cliente> cliente;
    private ArrayList<Emprestimo> emprestimos;

    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carro = new ArrayList<Carro>();
        this.cliente = new ArrayList<Cliente>();
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Carro> getCarro() {
        return this.carro;
    }

    public void setCarro(ArrayList<Carro> carro) {
        this.carro = carro;
    }

    public ArrayList<Cliente> getCliente() {
        return this.cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return this.emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

}