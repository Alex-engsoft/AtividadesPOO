import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " (" + quantidade + ") - " + preco;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 20.50, 10));
        produtos.add(new Produto("Feijão", 8.90, 5));
        produtos.add(new Produto("Leite", 4.75, 12));

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}