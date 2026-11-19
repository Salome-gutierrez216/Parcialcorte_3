/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author salom
 */
public class MotorCombate {

    // Sobrecarga 1: Combate Monstruo vs Monstruo (Ataque vs Ataque / Ataque vs Defensa)
    public String ejecutarAtaque(Jugador jAtacante, Jugador jDefensor,
                                 CartaMonstruo atacante, CartaMonstruo defensor,
                                 GestorPersistencia persistencia) {
        if (!atacante.estaEnAtaque()) {
            return "Error: " + atacante.getNombre() + " está en modo DEFENSA y no puede atacar.";
        }
        if (atacante.isDestruido() || defensor.isDestruido()) {
            return "Error: Uno de los monstruos ya fue destruido.";
        }

        int atqA = atacante.calcularFuerzaAtaque();
        int dano = 0;
        String resultado;

        if (defensor.estaEnAtaque()) {
            int atqD = defensor.calcularFuerzaAtaque();
            if (atqA > atqD) {
                dano = atqA - atqD;
                jDefensor.recibirDano(dano);
                defensor.setDestruido(true);
                resultado = defensor.getNombre() + " destruido. " + jDefensor.getNombre() + " pierde " + dano + " LP.";
            } else if (atqA < atqD) {
                dano = atqD - atqA;
                jAtacante.recibirDano(dano);
                atacante.setDestruido(true);
                resultado = atacante.getNombre() + " destruido. " + jAtacante.getNombre() + " pierde " + dano + " LP.";
            } else {
                atacante.setDestruido(true);
                defensor.setDestruido(true);
                resultado = "Empate: ambos monstruos destruidos. 0 LP de daño.";
            }
        } else {
            // Ataque vs Defensa
            int defD = defensor.getDefensa();
            if (atqA > defD) {
                defensor.setDestruido(true);
                resultado = defensor.getNombre() + " (DEF) destruido. 0 LP de daño.";
            } else if (atqA < defD) {
                dano = defD - atqA;
                jAtacante.recibirDano(dano);
                resultado = "Defensa superior. " + jAtacante.getNombre() + " pierde " + dano + " LP.";
            } else {
                resultado = "Empate en defensa: ningún monstruo destruido. 0 LP de daño.";
            }
        }

        String registro = "Atacante: " + atacante.getNombre() + " (" + atqA + ") vs Defensor: "
                + defensor.getNombre() + " | Daño: " + dano + " | Resultado: " + resultado;
        if (persistencia != null) {
            persistencia.guardarRegistro(registro);
        }
        return registro;
    }

    // Sobrecarga 2: Ataque Directo (sin defensor)
    public String ejecutarAtaque(Jugador jAtacante, Jugador jDefensor,
                                 CartaMonstruo atacante, GestorPersistencia persistencia) {
        if (!atacante.estaEnAtaque()) {
            return "Error: " + atacante.getNombre() + " está en modo DEFENSA y no puede atacar.";
        }

        int dano = atacante.calcularFuerzaAtaque();
        jDefensor.recibirDano(dano);
        String resultado = "Ataque directo exitoso. " + jDefensor.getNombre() + " pierde " + dano + " LP.";

        String registro = "Atacante: " + atacante.getNombre() + " (" + dano
                + ") vs DIRECTO | Daño: " + dano + " | Resultado: " + resultado;
        if (persistencia != null) {
            persistencia.guardarRegistro(registro);
        }
        return registro;
    }
}
