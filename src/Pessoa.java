public class Pessoa {
    int id;
    String nome;
    int idade;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public String toString() {
        return "id: " + id + ", nome: " + nome + ", idade: " + idade;
    }
}
