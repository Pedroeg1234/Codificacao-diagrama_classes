public class Main{

    public static void main(String[] args) {
        
        Cliente cliente= new Cliente();

        ContaCorrente contacorrente= new ContaCorrente();
        ContaPoupanca contapoupanca= new ContaPoupanca();

        cliente.adicionarContas(contacorrente);
        cliente.adicionarContas(contapoupanca);

        contacorrente.depositar(500);
        contapoupanca.depositar(1000);

        double saldoTotal=  cliente.consultarSaldoTotal();

        System.out.println(saldoTotal);

    }
}