import java.util.ArrayList;

public class Pessoa{


    private String nome;
    private int idade;
    private int id;
    private ArrayList<Livro> livros;
    private Biblioteca biblioteca; // Adiciona uma referência à Biblioteca

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Pessoa(){

        livros= new ArrayList<>();
    }

    public void pegarLivro(Livro livro) {
        if (biblioteca.isDisponivel(livro)) {
            livros.add(livro);
            biblioteca.removerLivro(livro);  // Adiciona o livro à pessoa e remove da biblioteca
        } else {
            System.out.println("Livro indisponível");
        }
    }


    public void devolverLivro(Livro livro){

        livros.add(livro);
    }

    public int getQuantidadeLivros(){

        return livros.size();
    }

    public Livro getLivro(int pos){

        return livros.get(pos);
    }
    

}