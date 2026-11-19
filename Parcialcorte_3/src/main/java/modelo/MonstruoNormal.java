/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author salom
 */

public class MonstruoNormal extends CartaMonstruo {

    public MonstruoNormal(String nombre, int ataque, int defensa, String posicion) {
        super(nombre, ataque, defensa, posicion);
    }

    @Override
    public String getTipoCarta() {
        return "Normal";
    }
}
