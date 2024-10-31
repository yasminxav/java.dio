public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public String getNome () {
        return nome;
    };
    public String getCpf () {
        return cpf;
    };
    public void setEndereco (String endereco) {
        this. endereco = endereco;
    };

    public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;

    }

}
