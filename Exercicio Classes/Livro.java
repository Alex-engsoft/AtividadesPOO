public class Livro {
    
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
    
    if (ano < 0) {
        System.out.println("Ano não pode ser negativo. Definido como 0");
        this.ano = 0;
    } else {
        this.ano = ano;
    }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 0) {
            throw new IllegalArgumentException("O ano não pode ser negativo.");
        }
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }

    public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("1984", "George Orwell", 1949);
        livro.exibirInfo();

        // livro.setAno(-100); // Descomente para ver a exceção sendo lançada
    }
}
}