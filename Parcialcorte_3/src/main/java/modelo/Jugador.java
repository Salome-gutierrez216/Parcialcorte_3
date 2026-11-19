/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author salom
 */

public class Jugador {
    public static final int LP_INICIAL = 8000;
    private String nombre;
    private int puntosVida;
    private ArrayList<CartaMonstruo> campo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntosVida = LP_INICIAL;
        this.campo = new ArrayList<>();
    }

    public void agregarMonstruo(CartaMonstruo monstruo) {
        this.campo.add(monstruo);
    }

    public void recibirDano(int dano) {
        if (dano > 0) {
            this.puntosVida -= dano;
            if (this.puntosVida < 0) {
                this.puntosVida = 0;
            }
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }
    public ArrayList<CartaMonstruo> getCampo() { return campo; }

    @Override
    public String toString() {
        return nombre + " | LP: " + puntosVida + " | Monstruos: " + campo.size();
    }
}