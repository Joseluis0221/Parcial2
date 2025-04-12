/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author estudiante103
 */
public class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;
    protected Arma arma;
    
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }
    
    public void equiparArma(Arma arma){
        this.arma = arma;
    }
    
    public void desequiparArma(){
        this.arma = null;
    }
    
    public boolean estaViva() {
        return salud >0;
    }
    
    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);
}
