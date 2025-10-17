public class Pedido {
    public void processarEntrega() {
        Rota rota = this.transportadora.getRota();
        rota.calcularEntrega(this);
    }
}

public class Cliente {
    public void enviarProduto(Pedido pedido) {
        // Cliente não precisa saber como funciona a entrega
        pedido.processarEntrega();
    }
}

// A regra "não usar mais de um ponto por linha" obriga a:
// - Pensar em encapsulamento real
// - Evitar conhecer detalhes internos de outros objetos
// - Criar métodos que representem melhor as intenções
//
// Isso muda o jeito tradicional de programar e faz pensar mais em design.
// Por isso, é uma das regras mais desafiadoras e transformadoras do Object Calisthenics.