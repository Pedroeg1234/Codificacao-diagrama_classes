

public class ContaBancaria{

    private int numeroDaConta;
    private String titularDaConta;
    private double saldo;
    private Banco banco;


   

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double verificarSaldo(){

        return saldo;
    }

    public void depositar(double valor){

        saldo+=valor;
    }

    public void sacar (double valor){

         if (valor<saldo){

            saldo-=valor;
         } else{

            System.out.println("Saldo inválido");
         }
    }

    

    


}