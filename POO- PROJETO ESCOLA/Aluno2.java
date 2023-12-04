import java.util.ArrayList;
import java.util.Date;

public class Aluno2 extends Pessoa {

    private Date datanascimento;
    private Turma2 turma;
    private ArrayList<Double> notas;

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Turma2 getTurma() {
        return turma;
    }

    public void setTurma(Turma2 turma) {
        this.turma = turma;
    }

    // Construtor para inicializar o ArrayList
    public Aluno2() {
        notas = new ArrayList<>();
    }

    public void adicionarNotas(double nota) {
        notas.add(nota);
    }

    public double mediaNotas() {
        if (notas.isEmpty()) {
            System.out.println("Não há notas para calcular a média.");
            return 0.0; // or throw an exception, depending on your requirements
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public void recuperacao(Aluno2 aluno) {
        double nota = aluno.mediaNotas();

        if (nota > 60) {
            System.out.println("Passou");
        } else {
            System.out.println("Reprovado");
        }
    }
}
