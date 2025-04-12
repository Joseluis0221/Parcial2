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
public class Main {
    public class Main {
    public static void main (String []args) {
        Dragon dragon = new Dragon("Draco", 100, 20);
        Mago mago = new Mago ("Merlin", 80, 15);
        Guerrero guerrero = new Guerrero("conan", 120, 18);
        
        Arma espada = new Arma ("Espada", 15);
        Arma baston = new Arma ("Baston", 3);
        Arma garras = new Arma ("garras", 7);
        
        Dragon.equiparArma(garras);
        Mago.equiparArma(Baston);
        Guerrero.equipoArma(espada);
        
        simularBatalla(dragon,mago);
        simularBatalla(mago,guerrero);
      
    }
    
    public static void 
           simularBatalla(Criatura c1, Criatura c2) {
               System.out.println("batalla entre " + c1.nombre + "y" + c2.nombre);
               
               while(c1.estaViva() && c2.estaViva()) {
                   c1.atacar(c2);
                   if (c2.estaViva());
                   c2.atacar(c1);
                   
               }
           }
           if (c1.estaViva()) {
               System.out.println(c1.nombre + "ha ganado");
            }else{
                   System.out.println(c2.nombre+"ha ganado");
            }
        }
          
}

