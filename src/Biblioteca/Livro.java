package Biblioteca;

public class Livro {

    private String genero;
    private String nome;
    private String isbn;
    private String pessoaAutora;

    public Livro(String genero, String nome, String isbn, String pessoaAutora) {
        this.genero = genero;
        this.nome = nome;
        this.isbn = isbn;
        this.pessoaAutora = pessoaAutora;
    }

    public Livro(String isbn) {
        this.isbn = isbn;
    }

    public Livro(String nome, String isbn) {
        this.nome = nome;
        this.isbn = isbn;
    }

    public Livro(String genero, String nome, String isbn) {
        this.genero = genero;
        this.nome = nome;
        this.isbn = isbn;
    }

    //----------------- Getters and Setters -----------------

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPessoaAutora() {
        return pessoaAutora;
    }

    //----------------- Métodos -----------------

    public void exibirFichaTecnica(){
        System.out.println("---------- INFORMAÇÕES SOBRE O LIVRO ----------");
        System.out.println("Gênero: " + getGenero());
        System.out.println("Nome: " + getNome());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Pessoa autora: " + getPessoaAutora());
    }

    public void registrarLivro(String isbn){
        System.out.println("O livro foi registrado com o ISBN " + isbn);
    }

    public void registrarLivro(String isbn, String nome){
        System.out.println("O livro foi registrado com o ISBN " + isbn + " e nome " + nome);
    }

    public void registrarLivro(String isbn, String nome, String genero){
        System.out.println("O livro foi registrado com o ISBN " + isbn + ", nome " + nome + " e gênero " + genero);
    }

    public void registrarLivro(String isbn, String nome, String genero, String pessoaAutora){
        System.out.println("O livro foi registrado com o ISBN " + isbn + ", nome "
                + nome + ", gênero " + genero + " e pessoa autora " + pessoaAutora);
    }









}
