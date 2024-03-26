public class Aluno {

    public String nome;
    public int idade;
    public String Endereco;
    public String telefone;
    public String email;
    public int matricula;


    public Aluno(String nome, int idade, String endereco, String telefone, String email, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.Endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
}
