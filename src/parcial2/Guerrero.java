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
public class Guerrero extends Criatura {
    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre,salud,fuerza);
    }

    /**
     *
     * @param objetivo
     */
    @Override
    public void atacar(Criatura objetivo) { 
        int daño = fuerza;
        if (arma ! = null){
        daño += arma.atacarConArma();
    }
      objetivo.defender(daño); 
    }
    
    @Override
    public void defender(int daño) {
        salud -= daño;
        if(salud<0) salud = 0;
    }
    
}
