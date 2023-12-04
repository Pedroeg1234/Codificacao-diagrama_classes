public class Carro implements Veiculo{


    @Override
    public void freiar(){

        System.out.println ("Carro Freiando");
    }

    @Override
    public void acelerar(){

        System.out.println ("Carro acelerando");
    }
}