/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author salom
 */

public abstract class CartaMonstruo implements ICombatible {
    protected String nombre;
    protected int ataque;
    protected int defensa;
    protected String posicion; // "ATAQUE" o "DEFENSA"
    protected boolean destruido;
    protected static int contadorCartas = 0;

    public CartaMonstruo(String nombre, int ataque, int defensa, String posicion) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.posicion = posicion.toUpperCase();
        this.destruido = false;
        contadorCartas++;
    }

    public abstract String getTipoCarta();

    @Override
    public int calcularFuerzaAtaque() {
        return this.ataque;
    }

    @Override
    public boolean estaEnAtaque() {
        return "ATAQUE".equalsIgnoreCase(this.posicion);
    }

    public static int getContadorCartas() {
        return contadorCartas;
    }

    public String getNombre() { return nombre; }
    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }
    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion.toUpperCase(); }
    public boolean isDestruido() { return destruido; }
    public void setDestruido(boolean destruido) { this.destruido = destruido; }
}