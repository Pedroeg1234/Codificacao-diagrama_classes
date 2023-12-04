package classes;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{


    private int registro;
    private String nivelCargo;
    private String experiencia;

   
    
    public int getRegistro() {
        return registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public String getNivelCargo() {
        return nivelCargo;
    }
    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public double Salario(){

        return 2000;
    }
    /* 
    @Override
    public boolean autenticar() {
        
        return login.equals("admin") && senha.equals("admin");
    }
    */

    public boolean autenticar(String login, String senha){

        return login.equals("admin") && senha.equals("admin");

    }
}