/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author salom
 */

public class MonstruoEfecto extends CartaMonstruo {
    private int bonoAtaque;

    public MonstruoEfecto(String nombre, int ataque, int defensa, String posicion, int bonoAtaque) {
        super(nombre, ataque, defensa, posicion);
        this.bonoAtaque = bonoAtaque;
    }

    // Polimorfismo por sobreescritura
    @Override
    public int calcularFuerzaAtaque() {
        return this.ataque + this.bonoAtaque;
    }

    @Override
    public String getTipoCarta() {
        return "Efecto (+" + bonoAtaque + " ATQ)";
    }

    public int getBonoAtaque() {
        return bonoAtaque;
    }
}