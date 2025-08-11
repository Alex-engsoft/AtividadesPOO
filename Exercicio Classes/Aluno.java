public class Aluno {
   
    private String nome;
    private double nota;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota = 0.0;
    }

    public void adicionarNota(double valor) {
        if (valor > 0 && valor + this.nota <= 10) {
            this.nota += valor;
            System.out.println("Nota adicionada com sucesso.");
        } else {
            System.out.println("Valor inválido. A nota não pode exceder 10 e deve ser positiva.");
        }
    }

    public void retirarNota(double valor) {
        if (valor > 0 && valor <= this.nota) {
            this.nota -= valor;
            System.out.println("Nota retirada com sucesso.");
        } else {
            System.out.println("Valor inválido. Não é possível retirar essa quantidade de nota.");
        }
    }

    public double consultarNota() {
        return this.nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");

        System.out.println("Nota inicial: " + aluno.consultarNota());

        aluno.adicionarNota(5);     // OK
        System.out.println("Nota atual: " + aluno.consultarNota());

        aluno.adicionarNota(6);     // Excede o limite (total seria 11)
        System.out.println("Nota atual: " + aluno.consultarNota());

        aluno.retirarNota(2);       // OK
        System.out.println("Nota atual: " + aluno.consultarNota());

        aluno.retirarNota(10);      // Erro: não tem nota suficiente
        System.out.println("Nota atual: " + aluno.consultarNota());

        aluno.adicionarNota(-3);    // Erro: valor negativo
        System.out.println("Nota atual: " + aluno.consultarNota());
    }
}
}
