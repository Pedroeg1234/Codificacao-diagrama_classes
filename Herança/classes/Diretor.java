package classes;
public class Diretor extends Pessoa{


    private int registroExecucao;
    private int tempoDirecao;
    private int titulacao;


    public int getRegistroExecucao() {
        return registroExecucao;
    }
    public void setRegistroExecucao(int registroExecucao) {
        this.registroExecucao = registroExecucao;
    }
    public int getTempoDirecao() {
        return tempoDirecao;
    }
    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }
    public int getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(int titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public double Salario(){

        return 3500;
    }    

}