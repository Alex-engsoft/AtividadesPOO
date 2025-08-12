public class Produto {
    private String nome;
    private double preco;

    public Produto() {
        this.nome = "";
        this.preco = 0.0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;

        if (preco < 0) {
            System.out.println("Preço inválido!");
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        System.out.println("Produto 1 - Nome: " + produto1.getNome() + ", Preço: " + produto1.getPreco());

        Produto produto2 = new Produto("Caderno", 12.5);
        System.out.println("Produto 2 - Nome: " + produto2.getNome() + ", Preço: " + produto2.getPreco());

        Produto produto3 = new Produto("Lápis", -3.0);
        System.out.println("Produto 3 - Nome: " + produto3.getNome() + ", Preço: " + produto3.getPreco());
    }
}
}