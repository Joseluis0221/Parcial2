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
    private Arma arma;

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void desequiparArma() {
        this.arma = null;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        if (arma != null) {
            daño += arma.atacarConArma();
        }
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " ha aterrizado.");
    }
}