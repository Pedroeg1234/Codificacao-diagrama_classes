import java.util.ArrayList;

public class Cliente{

    private ArrayList<ContaBancaria> contas= new ArrayList<>();

    public void adicionarContas(ContaBancaria conta){

        contas.add(conta);
    }

    public void ExcluirContas(ContaBancaria conta){

        contas.remove (conta);
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor){

        origem.sacar(valor);
        destino.depositar(valor);
    }

    public double consultarSaldoTotal() {
        double saldoTotal = 0;
    
        for (int i = 0; i < contas.size(); i++) {
            saldoTotal += contas.get(i).obterSaldo();
        }
    
        return saldoTotal;
    }
}