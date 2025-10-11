// Alta coesão, cada classe faz apenas uma coisa bem feita.
// Baixo acoplamento, classes independentes umas das outras.
// Isso facilita o princípio DRY, porque:
// O código fica mais organizado
// Podemos reaproveitar classes/métodos sem repetir
// É mais fácil manter e testar

// Exemplo com cod:

public class CalculadoraDesconto {
    public double calcularDesconto(double valor, double percentual) {
        return valor - (valor * percentual / 100);
    }
}

public class Pedido {
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public void aplicarDesconto(CalculadoraDesconto calc) {
        double valorComDesconto = calc.calcularDesconto(valor, 10);
        System.out.println("Valor com desconto: " + valorComDesconto);
    }
}

public class Main {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        Pedido pedido1 = new Pedido(100);
        Pedido pedido2 = new Pedido(200);

        pedido1.aplicarDesconto(calculadora);
        pedido2.aplicarDesconto(calculadora);
    }
}
