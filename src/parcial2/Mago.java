package parcial2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante103
 */
import java.util.ArrayList;

public class Mago extends Criatura implements Magico {
    private Arma arma;
    private final ArrayList<String> hechizos;

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        hechizos = new ArrayList<>();
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void desequiparArma() {
        this.arma = null;
    }

    @Override
    public void atacar(Criatura objetivo) {
        lanzarHechizo(objetivo);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }

    @Override
    public void lanzarHechizo(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma();
        }
        objetivo.defender(daño);
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        hechizos.add(hechizo);
    }
}
