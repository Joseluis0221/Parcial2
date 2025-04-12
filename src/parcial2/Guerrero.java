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
    private Arma arma;

    public Guerrero(String nombre, int salud, int fuerza) {
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
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma();
        }
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }
}
