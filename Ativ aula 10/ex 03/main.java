public class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}

public class Calculadora {
    public static int dividir(int a, int b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Divisão por zero.");
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int resultado = Calculadora.dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}