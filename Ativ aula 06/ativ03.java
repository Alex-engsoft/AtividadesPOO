public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

class Aluno extends Pessoa {
    String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }
}

class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Mariana Costa", "2025A123");

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
    }
}