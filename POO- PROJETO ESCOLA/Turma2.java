import java.util.ArrayList;

public class Turma2{

    private String sigla;
    private int ano;

    private ArrayList<Professor2> professores;
    private ArrayList<Disciplina2> disciplinas;
    private ArrayList<Aluno2> alunos;

    public Turma2(){

        professores= new ArrayList<Professor2>();
        disciplinas= new ArrayList<Disciplina2>();
        alunos= new ArrayList<Aluno2>();


    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public void adicionarAluno(Aluno2 aluno){
        alunos.add (aluno);
    }

    public void excluirAluno(Aluno2 aluno){

        alunos.remove(aluno);
    }

    public int quantidadeAlunos(){

        return alunos.size();
    }

    public Aluno2 getAluno(int posicao){

        return alunos.get(posicao);
        
    }



    public void adicionarDisciplina(Disciplina2 disciplina){
        disciplinas.add (disciplina);
    }

    public void excluirDisciplina(Disciplina2 disciplina){

        disciplinas.remove(disciplina);
    }

    public int quantidadeDisciplina(){

        return disciplinas.size();
    }

    public Disciplina2 getDisciplina(int posicao){

        return disciplinas.get(posicao);
        
    }




     public void adicionarProfessores(Professor2 professor){
        professores.add (professor);
    }

    public void excluirProfessores(Professor2 professor){

        professores.remove(professor);
    }

    public int quantidadeProfessores(){

        return professores.size();
    }

    public Professor2 getProfessores(int posicao){
        return professores.get(posicao);
    }

    @Override
    public String toString() {
        return "Turma2 [sigla=" + sigla + ", ano=" + ano + ", professores=" + professores + ", disciplinas="
                + disciplinas + ", alunos=" + alunos + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
        result = prime * result + ano;
        result = prime * result + ((professores == null) ? 0 : professores.hashCode());
        result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
        result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Turma2 other = (Turma2) obj;
        if (sigla == null) {
            if (other.sigla != null)
                return false;
        } else if (!sigla.equals(other.sigla))
            return false;
        if (ano != other.ano)
            return false;
        if (professores == null) {
            if (other.professores != null)
                return false;
        } else if (!professores.equals(other.professores))
            return false;
        if (disciplinas == null) {
            if (other.disciplinas != null)
                return false;
        } else if (!disciplinas.equals(other.disciplinas))
            return false;
        if (alunos == null) {
            if (other.alunos != null)
                return false;
        } else if (!alunos.equals(other.alunos))
            return false;
        return true;
    }

   
    
}