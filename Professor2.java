import java.util.ArrayList;

public class Professor2 extends Pessoa{

   

    private String formacaoacademica;
    private double salario;

    private ArrayList<Disciplina2> disciplinas;
    private ArrayList<Turma2> turmas;


     public String getFormacaoacademica() {
        return formacaoacademica;
    }

    public void setFormacaoacademica(String formacaoacademica) {
        this.formacaoacademica = formacaoacademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public Professor2(){

        disciplinas= new ArrayList<Disciplina2>();
        turmas= new ArrayList<Turma2>();
    }

    public void adicionarDisciplina(Disciplina2 disciplina){

        disciplinas.add(disciplina);
    }

    public void removerDisciplinas (Disciplina2 disciplina){

        disciplinas.remove(disciplina);
    }

    public int getTamanhoDisciplinas(){

        return disciplinas.size();
    }

    public Disciplina2 getPosicaoDis(int posicao){

        return disciplinas.get(posicao);
    }


    public void adicionarTurma (Turma2 turma){

        turmas.add(turma);
    }

    public void excluirturmas (Turma2 turma){

        turmas.remove(turma);
    }

    public int getTurmasTamanho(){

       return turmas.size();
    }

    public Turma2 getPosicaoTurma (int posicao){

        return turmas.get(posicao);
    }


    public void aplicarAvalicao(){
        
    }

   



   
}