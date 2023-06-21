package Biblioteca;

public class Main {
    public static void main(String[] args) {

        Livro meuLivro = new Livro("Fantasia", "O Hobbit", "8595084742", "J.R.R. Tolkien");
        Livro livroDaThais = new Livro("Psicologia", "Psicanalista das Arábias", "6555524235",
                "Thais Del Rey");
        Livro livroDoJC = new Livro("Informática", "Deuses do Java", "7777777777",
                "JC, o Brabo do Spring!");

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("EXEMPLOS DE LIVROS");
        System.out.println();
        meuLivro.exibirFichaTecnica();
        System.out.println();
        livroDaThais.exibirFichaTecnica();
        System.out.println();
        livroDoJC.exibirFichaTecnica();

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("REGISTRANDO LIVROS");
        System.out.println("---------------------------------------------------------------");
        Livro livro1 = new Livro("0000000001");
        Livro livro2 = new Livro("0000000002", "Livro 2");
        Livro livro3 = new Livro("Romance", "0000000003", "Livro 3");
        Livro livro4 = new Livro("Terror", "Livro 4", "0000000004", "Clive Barker");

        livro1.registrarLivro("0000000001");
        livro2.registrarLivro("0000000002", "Livro 2");
        livro3.registrarLivro("0000000003", "Livro 3", "Romance");
        livro4.registrarLivro("0000000004", "Livro 4", "Terror", "Clive Barker");
    }
}
