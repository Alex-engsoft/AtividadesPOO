abstract class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    abstract double calcularBonus();
}

class Gerente extends Funcionario {
    Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return salario * 0.20; // 20% de bônus
    }
}

class Vendedor extends Funcionario {
    Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return salario * 0.10; // 10% de bônus
    }
}

public class funcionario {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
                new Gerente("Ana", 5000.0),
                new Vendedor("Carlos", 3000.0),
                new Vendedor("Mariana", 3500.0),
                new Gerente("João", 7000.0)
        };

        for (Funcionario f : funcionarios) {
            System.out.println(f.nome + " - Bônus: R$ " + f.calcularBonus());
        }
    }
}
