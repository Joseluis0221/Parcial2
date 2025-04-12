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
public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza){
        super(nombre, salud, fuerza);
        
    }
    
    public void volar() [] {}
    public void aterrizar() {}
    
    public void atacar(Criatura objetivo){
        int daño = fuerza * 3;
        if (arma ! = null){
        daño + = arma.atacarConArma();
    }
        objetivo.defender(daño);
      }
    
    public void defender(int daño) {
    salud - = daño;
    if (salud < 0) salud = 0;
    
  }
    
}
