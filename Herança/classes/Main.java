package classes;

import javax.swing.JOptionPane;

public class Main{


    public static void main(String[] args) {
        
        Secretario secretario= new Secretario();
        String login = JOptionPane.showInputDialog("Digite o login:");

        // Usando JOptionPane para ler a senha
        String senha = JOptionPane.showInputDialog("Digite a senha:");

        if (secretario.autenticar(login, senha)){

        Aluno aluno=new Aluno();

        aluno.setIdade(18);

        System.out.println (aluno.maiorIdade());
        System.out.println (aluno.msgMaiorIdade());


        } else{
            System.out.println ("Acesso negado");
        }
       
        
    }
}