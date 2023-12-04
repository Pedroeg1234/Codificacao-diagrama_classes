import java.util.ArrayList;

public class Banco{

    private ArrayList<Cliente> clientes;
    private ArrayList<ContaBancaria> contas;

    
    public Banco(){

        clientes=new ArrayList<>();
        contas= new ArrayList<>();

    }

    public void adicionarContaBancaria(ContaBancaria conta){

        contas.add(conta);
    }

    public void excluirContaBancaria(ContaBancaria conta){

        contas.remove(conta);
    }

    public ContaBancaria getConta(int pos){

        return contas.get(pos);
    }

    public int quantidadeContas(){

        return contas.size();
    }

    public void adicionarCliente(Cliente cliente){

        clientes.add(cliente);
    }

    public void removerClientes(Cliente cliente){

        clientes.remove(cliente);
    }

    public Cliente getClientes(int pos){

        return clientes.get(pos);
    }

    public int quantidadeClientes(){

        return clientes.size();
    }

    public void informacoesContas(){

        for (int i=0;i<contas.size();i++){

            System.out.println ("Conta: " +1);
            System.out.println(contas.get(i).getSaldo());
            System.out.println (contas.get(i).getTitularDaConta());
            System.out.println (contas.get(i).getNumeroDaConta());
        }
    }
}