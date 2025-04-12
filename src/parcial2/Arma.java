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
public class Arma {
    private final String nombre;
    private final int dañoAdicional;

    public Arma(String nombre, int dañoAdicional) {
        this.nombre = nombre;
        this.dañoAdicional = dañoAdicional;
    }

    public int atacarConArma() {
        return dañoAdicional;
    }

    public int getDañoAdicional() {
        return dañoAdicional;
    }

    public String getNombre() {
        return nombre;
    }
}
