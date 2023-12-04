import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        try {

            Biblioteca biblioteca = new Biblioteca();

            Livro livro1 = new Livro();
            livro1.setTitulo("Pai rico pai pobre");

            Livro livro2 = new Livro();
            livro2.setTitulo("O futuro do dinheiro");

            Livro livro3 = new Livro();
            livro3.setTitulo("Mais esperto que o diabo");

            biblioteca.adicionarLivro(livro1);
            biblioteca.adicionarLivro(livro2);
            biblioteca.adicionarLivro(livro3);

            Pessoa pessoa1 = new Pessoa();
            pessoa1.setNome("Pedro");
            pessoa1.setBiblioteca(biblioteca);
            pessoa1.pegarLivro(livro1);
            pessoa1.pegarLivro(livro2);

            System.out.println("Livros que foram pegados pela pessoa 1:");
            for (int i = 0; i < pessoa1.getQuantidadeLivros(); i++) {
                System.out.println(pessoa1.getLivro(i).getTitulo());
            }

            // Criar um arquivo incorretamente (forçar uma exceção IOException)
            /*String caminhoInvalido = "/caminho/invalido/arquivo.txt";
            FileWriter fileWriter = new FileWriter(caminhoInvalido);
            fileWriter.write("Conteúdo do arquivo");
            fileWriter.close();
*/
            System.out.println("Livros disponíveis:");
            biblioteca.livrosDisponiveis();


            // Tentar converter uma string não numérica para um número
            String stringNaoNumerica = "abc";
            int numero = Integer.parseInt(stringNaoNumerica);
            System.out.println (numero);
            

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("MENSAGEM: Ocorreu um NullPointerException - " + e.getMessage());

            for (int i = 0; i < e.getStackTrace().length; i++) {
                System.out.println("Classe onde está o erro: " + e.getStackTrace()[i].getClassName());
                System.out.println("Método de erro: " + e.getStackTrace()[i].getMethodName());
                System.out.println("Linha de erro: " + e.getStackTrace()[i].getLineNumber());
                System.out.println("Tipo de erro:" + e.getClass().getName());
            }
        }  catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("MENSAGEM: Ocorreu uma NumberFormatException - " + e.getMessage());
                System.out.println("Tipo de erro: " + e.getClass().getName());
               
        
            }  /*catch (IOException e) {
                e.printStackTrace();
                System.out.println("MENSAGEM: Ocorreu uma IOException - " + e.getMessage());
                System.out.println("Tipo de erro:" + e.getClass().getName());
            }*/

            finally{ //ACONTECE TENDO ERROS OU NÃO
                System.out.println("CONTINUANDO PROGRAMA...");
            }
        
        
    }
}
