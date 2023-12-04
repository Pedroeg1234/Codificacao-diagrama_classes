class Carro implements Motorizado {
    private boolean ligado;

    @Override
    public void ligar() {
        if (!ligado) {
            System.out.println("O carro está ligado.");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            System.out.println("O carro está desligado.");
            ligado = false;
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    @Override
    public void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando.");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }

    @Override
    public void frear() {
        if (ligado) {
            System.out.println("O carro está freando.");
        } else {
            System.out.println("Não é possível frear. O carro está desligado.");
        }
    }
}

