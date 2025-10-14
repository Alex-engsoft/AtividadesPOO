interface Andador {
    void andar();
}

interface Voador {
    void voar();
}

class Pato implements Andador, Voador {
    public void andar() { }
    public void voar() { }
}

class Pinguim implements Andador {
    public void andar() { }
}