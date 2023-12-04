import java.util.ArrayList;

public class Disciplina2{


    private String nome;
    private int cargahoraria;
   
    
    private ArrayList<Professor2> professores;
    private ArrayList<Turma2> turmas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public Disciplina2(){

        professores= new ArrayList<>();
        turmas= new ArrayList<>();
    }

    public void adicionarProfessores(Professor2 professor){

        professores.add(professor);
    }

    public void excluirProfessor(Professor2 professor){
        professores.remove(professor);
    }

    public int getTamanhoProfessor(){
        return professores.size();
    }

    public Professor2 getPosicaoProfessor(int posicao){

        return professores.get(posicao);
    }


    public void adicionarTurmas(Turma2 turma){

        turmas.add(turma);
    }

    public void removerTurmas(Turma2 turma){

        turmas.remove(turma);
    }

    public int tamanhoTurmas (Turma2 turma){

        return turmas.size();
    }

    public Turma2 getPosicaoTurma(int posicao){

        return turmas.get(posicao);
    }
   
  
    
}