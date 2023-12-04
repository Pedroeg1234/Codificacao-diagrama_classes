import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args){


        String login= JOptionPane.showInputDialog("Informe o login:");
        String senha= JOptionPane.showInputDialog("Informe a senha:");

        if (login.equals ("user") && senha.equals("123")){

       Professor2 professor1 = new Professor2();

        professor1.setNome(JOptionPane.showInputDialog("Informe o nome do Professor 1:"));
        professor1.setFormacaoacademica(JOptionPane.showInputDialog("Informe a formação acadêmica do Professor 1:"));
        professor1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do Professor 1:")));

        Professor2 professor2 = new Professor2();

        professor2.setNome(JOptionPane.showInputDialog("Informe o nome do Professor 2:"));
        professor2.setFormacaoacademica(JOptionPane.showInputDialog("Informe a formação acadêmica do Professor 2:"));
        professor2.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do Professor 2:")));

        Disciplina2 disciplina1 = new Disciplina2();
        disciplina1.setNome(JOptionPane.showInputDialog("Informe o nome da Disciplina 1:"));
        disciplina1.setCargahoraria(Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária da Disciplina 1:")));

        Disciplina2 disciplina2 = new Disciplina2();
        disciplina2.setNome(JOptionPane.showInputDialog("Informe o nome da Disciplina 2:"));
        disciplina2.setCargahoraria(Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária da Disciplina 2:")));

        // ASSOCIAÇÃO ENTRE DISCIPLINAS E PROFESSORES
        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarProfessores(professor1);

        // ASSOCIACAO ENTRE PROFESSORES E DISCIPLINAS
        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessores(professor2);

        Turma2 turma1 = new Turma2();

        turma1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da Turma 1:")));
        turma1.setSigla(JOptionPane.showInputDialog("Informe a sigla da Turma 1:"));

        Turma2 turma2 = new Turma2();

        turma2.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da Turma 2:")));
        turma2.setSigla(JOptionPane.showInputDialog("Informe a sigla da Turma 2:"));

        // ASSOCIACAO ENTRE TURMA E PROFESSORES//
        professor1.adicionarTurma(turma1);
        turma1.adicionarProfessores(professor1);

        // ASSOCIAÇÃO ENTRE PROFESSORES E TURMAS//
        professor2.adicionarTurma(turma2);
        turma2.adicionarProfessores(professor2);

        Aluno2 aluno1 = new Aluno2();

        aluno1.setNome(JOptionPane.showInputDialog("Informe o nome do Aluno 1:"));
        aluno1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do Aluno 1:")));
        // ASSOCIACAO ENTRE TURMA E ALUNO
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1);

        Aluno2 aluno2 = new Aluno2();

        aluno2.setNome(JOptionPane.showInputDialog("Informe o nome do Aluno 2:"));
        aluno2.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do Aluno 2:")));
        // ASSOCIACÃO ENTRE TURMA E ALUNO
        aluno2.setTurma(turma2);
        turma2.adicionarAluno(aluno2);

        // ASSOCIAÇÃO ENTRE TURMA E DISCIPLINA//
        turma1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarTurmas(turma1);
        turma1.adicionarDisciplina(disciplina2);
        disciplina2.adicionarTurmas(turma1);
    
        System.out.println("Alunos da Turma " + turma1.getSigla() + ":");
         for (int i = 0; i < turma1.quantidadeAlunos(); i++) {
             System.out.println(turma1.getAluno(i).getNome());
         }

         System.out.println ("Professores da Turma: " + turma1.getSigla());

         for (int i=0;i<turma1.quantidadeProfessores();i++){

            System.out.println (turma1.getProfessores(i).getNome());
         }

         System.out.println("Disciplinas da Turma " + turma1.getSigla() + ":");


        for (int i = 0; i < turma1.quantidadeDisciplina(); i++) {
             System.out.println(turma1.getDisciplina(i).getNome());
            }


        System.out.println ("Disciplnas do Professor:" + professor1.getNome());
             for (int i = 0; i < professor1.getTamanhoDisciplinas(); i++) {
             System.out.println(professor1.getPosicaoDis(i).getNome());
            }

            System.out.println(turma1.toString());
            System.out.println(turma2.toString());


        System.out.println("Turma1 é igual a Turma2? " + turma1.equals(turma2));

        // Testar o método hashCode
        System.out.println("HashCode de Turma1: " + turma1.hashCode());
        System.out.println("HashCode de Turma2: " + turma2.hashCode());

        System.out.println(disciplina1.toString());
          System.out.println(professor1.toString());


          //MÉTODO MÉDIA DAS NOTAS//

          ArrayList<Aluno2> alunos = new ArrayList<>();
          aluno1.adicionarNotas(10);
          aluno1.adicionarNotas(5.5);
          aluno1.adicionarNotas(7);
          aluno1.mediaNotas();
          aluno1.recuperacao(aluno1);
          alunos.add(aluno1);

          aluno2.adicionarNotas(10);
          aluno2.adicionarNotas(5.5);
          aluno2.adicionarNotas(7);
          aluno2.mediaNotas();
          aluno2.recuperacao(aluno1);
          alunos.add(aluno2);


          ArrayList<Aluno2> alunosAprovados= new ArrayList();
          ArrayList<Aluno2> alunosReprovados= new ArrayList();


          for (int i = 0; i < alunos.size(); i++) {
            Aluno2 aluno = alunos.get(i);
            System.out.println("Média do aluno " + (i + 1) + ": ");
            aluno.mediaNotas();
            aluno.recuperacao(aluno);

            if (aluno.mediaNotas()>60){
                alunosAprovados.add(aluno);
            } else{
                alunosReprovados.add(aluno);
            }
        }

          
            

         // Percorre a lista e troca os atributos se o nome for "Pedro"
         for (Aluno2 aluno : alunos) {
            if ("Pedro".equals(aluno.getNome())) {
                // Troca os atributos específicos
                aluno.setDatanascimento(new Date(28)); // Aqui você pode substituir por o valor desejado
                aluno.setTurma(turma2); // Supondo que turma2 seja uma instância de Turma2
            }
        }
        }
        
    


     
 }

}
