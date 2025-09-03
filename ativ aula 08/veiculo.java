abstract class Animal {
    abstract void emitirSom();
}

class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Au Au!");
    }
}

class Gato extends Animal {
    void emitirSom() {
        System.out.println("Miau!");
    }
}

public class veiculo {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro(),
                new Gato(),
                new Cachorro()
        };

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}