/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;
import controlador.ControladorBatalla;
import java.util.ArrayList;
import modelo.CartaMonstruo;
import modelo.Jugador;
import modelo.MonstruoEfecto;
import modelo.MonstruoNormal;
import vista.VistaBatalla;  
/**
 *
 * @author salom
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Jugador j1 = new Jugador("Yugi");
        Jugador j2 = new Jugador("Kaiba");
        jugadores.add(j1);
        jugadores.add(j2);

        // Cartas iniciales de muestra para los reportes en consola
        j1.agregarMonstruo(new MonstruoNormal("Mago Oscuro", 2500, 2100, "ATAQUE"));
        j1.agregarMonstruo(new MonstruoEfecto("Chica Maga Oscura", 2000, 1700, "ATAQUE", 300));
        j2.agregarMonstruo(new MonstruoNormal("Dragón Blanco de Ojos Azules", 3000, 2500, "ATAQUE"));

        // Reporte 1: Estado de jugadores en estructura dinámica
        System.out.println("=== REPORTE 1: JUGADORES REGISTRADOS ===");
        for (Jugador j : jugadores) {
            System.out.println(j.toString());
        }

        // Reporte 2: Monstruos con ATQ efectivo >= 2300 y total global
        System.out.println("\n=== REPORTE 2: MONSTRUOS DE ALTO PODER (>= 2300 ATQ) ===");
        for (Jugador j : jugadores) {
            for (CartaMonstruo m : j.getCampo()) {
                if (m.calcularFuerzaAtaque() >= 2300) {
                    System.out.println(j.getNombre() + " -> " + m.getNombre()
                            + " [" + m.getTipoCarta() + "] ATQ Efectivo: " + m.calcularFuerzaAtaque());
                }
            }
        }
        System.out.println("Total de cartas instanciadas: " + CartaMonstruo.getContadorCartas());

        // Lanzamiento de la GUI con MVC
        java.awt.EventQueue.invokeLater(() -> {
            VistaBatalla vista = new VistaBatalla();
            new ControladorBatalla(vista, j1, j2);
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
        });
    }
}
