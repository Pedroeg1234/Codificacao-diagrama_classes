package classes;
import java.util.ArrayList;

public class Aluno extends Pessoa{

    protected int dataMatricula;
    protected String nomeEscola;
    protected int serieMatriculado;
    protected ArrayList<String> disciplinas;


    public int getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(int dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public String getNomeEscola() {
        return nomeEscola;
    }
    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
    public int getSerieMatriculado() {
        return serieMatriculado;
    }
    public void setSerieMatriculado(int serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }
    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
    

    @Override /*Método sobrescrito */
    public boolean maiorIdade(){
        
        return idade>=21;
    }

    public String msgMaiorIdade(){

       boolean ehMaior= maiorIdade();

        if (ehMaior){
           return "Maior";
        } else{
            return "Menor";
        }
    }

    @Override
    public double Salario(){

        return 4000;
    }
}