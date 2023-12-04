public class Main{

    public static void main(String[] args) {
        

        Banco banco= new Banco();


        ContaBancaria conta1=new ContaBancaria();

        conta1.setTitularDaConta("Pedro");
        conta1.setNumeroDaConta(1243);


        Cliente cliente1=new Cliente();

        cliente1.setNome("Pedro");
        cliente1.setConta(conta1);


        banco.adicionarContaBancaria(conta1);

        conta1.depositar(1000);
        conta1.sacar(500);

        System.out.println ("SALDO CONTA 1:");
        System.out.println(conta1.getSaldo());


        banco.informacoesContas();
        
    }
}