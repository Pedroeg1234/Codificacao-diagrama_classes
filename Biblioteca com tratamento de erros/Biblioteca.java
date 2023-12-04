import java.util.ArrayList;

public class Biblioteca{

    private ArrayList<Livro> livros;
    private ArrayList<Pessoa> pessoas;


    public Biblioteca(){

        //livros= null; 
        livros= new ArrayList<>();
        pessoas= new ArrayList<>();
    }


    public void adicionarLivro(Livro livro){

        livros.add(livro);
    }

    public void removerLivro(Livro livro){

        livros.remove(livro);
    }

    public Livro getLivro(int pos){

        return livros.get(pos);
    }

    public boolean isDisponivel(Livro livro){

       return livros.contains(livro);
    }

    public void livrosDisponiveis(){

        for (int i=0;i<livros.size();i++){
        System.out.println (livros.get(i).getTitulo());
    }
}

    public void cadastrarPessoa(Pessoa pessoa){

        pessoas.add(pessoa);
    }

    public void removerPessoaCadastrada(Pessoa pessoa){

        pessoas.remove(pessoa);
    }


    @Override
    public String toString() {
        return "Biblioteca [livros=" + livros + ", pessoas=" + pessoas + "]";
    }
    
    
}