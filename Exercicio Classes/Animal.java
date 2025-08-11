public class Animal {
    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
        this.especie = especie;
    }

    public String consultarDados() {
        return "Nome: " + nome + ", Espécie: " + especie;
    }

    public void mudarNome(String novoNome) {
        if (novoNome == null || novoNome.trim().isEmpty()) {
            System.out.println("Nome inválido. Não pode ser vazio.");
            return;
        }
        this.nome = novoNome;
        System.out.println("Nome alterado com sucesso.");
    }

    public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Fido", "Cachorro");

        System.out.println(animal.consultarDados());

        animal.mudarNome(""); // inválido
        System.out.println(animal.consultarDados());

        animal.mudarNome("Rex"); // válido
        System.out.println(animal.consultarDados());
    }
}
}
