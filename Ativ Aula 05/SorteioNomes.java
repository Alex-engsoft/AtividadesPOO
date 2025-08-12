import java.util.ArrayList;
import java.util.Random;

public class SorteioNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");
        nomes.add("Eduardo");

        Random random = new Random();
        int indice = random.nextInt(nomes.size());

        String nomeSorteado = nomes.get(indice);
        System.out.println("Nome sorteado: " + nomeSorteado);
    }
}