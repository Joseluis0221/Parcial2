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
    public static void main(String[] args) {
        Arma espada = new Arma("Espada legendaria", 10);
        Arma baston = new Arma("Bastón mágico", 8);

        Dragon dragon = new Dragon("Smaug", 100, 20);
        Mago mago = new Mago("Gandalf", 80, 15);
        Guerrero guerrero = new Guerrero("Conan", 120, 18);

        dragon.equiparArma(new Arma("Fuego del dragón", 12));
        mago.equiparArma(baston);
        guerrero.equiparArma(espada);

        simularBatalla(dragon, mago);
        simularBatalla(mago, guerrero);
        simularBatalla(dragon, guerrero);
    }

    public static void simularBatalla(Criatura c1, Criatura c2) {
        System.out.println("Inicia batalla entre " + c1.getNombre() + " y " + c2.getNombre());

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            System.out.println(c1.getNombre() + " ataca a " + c2.getNombre() + ". Salud de " + c2.getNombre() + ": " + c2.getSalud());
            if (!c2.estaViva()) break;

            c2.atacar(c1);
            System.out.println(c2.getNombre() + " ataca a " + c1.getNombre() + ". Salud de " + c1.getNombre() + ": " + c1.getSalud());
        }

        if (c1.estaViva()) {
            System.out.println(c1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println(c2.getNombre() + " ha ganado la batalla.");
        }

        System.out.println("-------------------------------");
    }
}
