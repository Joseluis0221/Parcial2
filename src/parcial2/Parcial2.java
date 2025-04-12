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
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arma espada = new Arma("Espada Legendaria", 10);
        Arma baston = new Arma("Bastón Mágico", 8);
        Arma fuegoDragon = new Arma("Fuego del Dragón", 12);

        Dragon dragon = new Dragon("Smaug", 100, 20);
        Mago mago = new Mago("Gandalf", 80, 15);
        Guerrero guerrero = new Guerrero("Conan", 120, 18);

        dragon.equiparArma(fuegoDragon);
        mago.equiparArma(baston);
        guerrero.equiparArma(espada);

        mago.aprenderHechizo("Bola de fuego");
        mago.aprenderHechizo("Relámpago");

        dragon.volar();
        simularBatalla(dragon, mago);
        dragon.aterrizar();

        System.out.println();
        simularBatalla(mago, guerrero);

        System.out.println();
        simularBatalla(dragon, guerrero);
    }

    public static void simularBatalla(Criatura c1, Criatura c2) {
        System.out.println("===== INICIA BATALLA =====");
        System.out.println(c1.getNombre() + " VS " + c2.getNombre());
        System.out.println("==========================");

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            System.out.println(c1.getNombre() + " ataca a " + c2.getNombre() + ". Salud restante: " + c2.getSalud());

            if (!c2.estaViva()) break;

            c2.atacar(c1);
            System.out.println(c2.getNombre() + " ataca a " + c1.getNombre() + ". Salud restante: " + c1.getSalud());
        }

        System.out.println("--------------------------");
        if (c1.estaViva()) {
            System.out.println(c1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println(c2.getNombre() + " ha ganado la batalla.");
        }
        System.out.println("==========================\n");
    }
}
    
    

