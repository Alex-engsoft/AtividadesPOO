import java.util.*;

class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String toString() {
        return nome + " (" + matricula + ") - " + curso;
    }
}

class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }
}

class Funcionario {
    private String nome;
    private double salario;
    private Departamento dep;

    public Funcionario(String nome, double salario, Departamento dep) {
        this.nome = nome;
        this.salario = salario;
        this.dep = dep;
    }

    public String toString() {
        return nome + " - " + salario + " - " + dep.getNome();
    }
}

class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}

class ItemPedido {
    private String produto;
    private int qtd;
    private double preco;

    public ItemPedido(String produto, int qtd, double preco) {
        this.produto = produto;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public double getTotal() {
        return qtd * preco;
    }
}

class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String produto, int qtd, double preco) {
        itens.add(new ItemPedido(produto, qtd, preco));
    }

    public void removerItem(String produto) {
        Iterator<ItemPedido> it = itens.iterator();
        while (it.hasNext()) {
            if (it.next().getProduto().equalsIgnoreCase(produto)) {
                it.remove();
                break;
            }
        }
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido i : itens) {
            total += i.getTotal();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", "001", "Engenharia"));
        alunos.add(new Aluno("Bruno", "002", "Medicina"));
        alunos.add(new Aluno("Carlos", "003", "Direito"));
        for (Aluno a : alunos) {
            System.out.println(a);
        }

        Calculadora c = new Calculadora();
        System.out.println(c.soma(2, 3));
        System.out.println(c.soma(2.5, 3.5));
        System.out.println(c.soma(1, 2, 3));

        Departamento ti = new Departamento("TI");
        Departamento rh = new Departamento("RH");

        Funcionario f1 = new Funcionario("Joao", 3000, ti);
        Funcionario f2 = new Funcionario("Maria", 4000, rh);
        Funcionario f3 = new Funcionario("Pedro", 3500, ti);

        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f3);
        rh.adicionarFuncionario(f2);

        System.out.println("Funcionários TI:");
        ti.listarFuncionarios();
        System.out.println("Funcionários RH:");
        rh.listarFuncionarios();

        Pedido p = new Pedido();
        p.adicionarItem("Mouse", 2, 50);
        p.adicionarItem("Teclado", 1, 120);
        p.adicionarItem("Monitor", 1, 900);
        p.removerItem("Teclado");
        System.out.println("Total do pedido: R$ " + p.valorTotal());
    }
}
