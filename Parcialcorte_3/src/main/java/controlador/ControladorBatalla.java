/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.CartaMonstruo;
import modelo.GestorPersistencia;
import modelo.Jugador;
import modelo.MonstruoEfecto;
import modelo.MonstruoNormal;
import modelo.MotorCombate;
import vista.VistaBatalla;

/**
 *
 * @author salom
 */

public class ControladorBatalla implements ActionListener {
    private VistaBatalla vista;
    private Jugador jugador1;
    private Jugador jugador2;
    private MotorCombate motor;
    private GestorPersistencia persistencia;

    public ControladorBatalla(VistaBatalla vista, Jugador jugador1, Jugador jugador2) {
        this.vista = vista;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.motor = new MotorCombate();
        this.persistencia = new GestorPersistencia();

        this.vista.getBtnAtacar().addActionListener(this);
        this.vista.getBtnVerHistorial().addActionListener(this);
        actualizarMarcador();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnAtacar()) {
            procesarCombate();
        } else if (e.getSource() == vista.getBtnVerHistorial()) {
            vista.getTxtAreaLog().setText(persistencia.leerHistorial());
        }
    }

    private void procesarCombate() {
        try {
            String nom1 = vista.getTxtNombreM1().getText().trim();
            int atq1 = Integer.parseInt(vista.getTxtAtqM1().getText().trim());
            int def1 = Integer.parseInt(vista.getTxtDefM1().getText().trim());
            int bono1 = Integer.parseInt(vista.getTxtBonoM1().getText().trim());
            String pos1 = vista.getCmbPosM1().getSelectedItem().toString();

            if (nom1.isEmpty() || atq1 < 0 || def1 < 0 || bono1 < 0) {
                JOptionPane.showMessageDialog(vista, "Ingresa un nombre válido y valores numéricos positivos.");
                return;
            }

            CartaMonstruo m1 = (bono1 > 0)
                    ? new MonstruoEfecto(nom1, atq1, def1, pos1, bono1)
                    : new MonstruoNormal(nom1, atq1, def1, pos1);
            jugador1.agregarMonstruo(m1);

            String resultado;
            if (vista.getChkAtaqueDirecto().isSelected()) {
                resultado = motor.ejecutarAtaque(jugador1, jugador2, m1, persistencia);
            } else {
                String nom2 = vista.getTxtNombreM2().getText().trim();
                int atq2 = Integer.parseInt(vista.getTxtAtqM2().getText().trim());
                int def2 = Integer.parseInt(vista.getTxtDefM2().getText().trim());
                String pos2 = vista.getCmbPosM2().getSelectedItem().toString();

                CartaMonstruo m2 = new MonstruoNormal(nom2, atq2, def2, pos2);
                jugador2.agregarMonstruo(m2);
                resultado = motor.ejecutarAtaque(jugador1, jugador2, m1, m2, persistencia);
            }

            vista.getTxtAreaLog().append(resultado + "\n");
            actualizarMarcador();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Error: Los campos de ATQ, DEF y Bono deben ser números enteros.");
        }
    }

    private void actualizarMarcador() {
        vista.getLblLPJugador1().setText(jugador1.getNombre() + " - LP: " + jugador1.getPuntosVida());
        vista.getLblLPJugador2().setText(jugador2.getNombre() + " - LP: " + jugador2.getPuntosVida());
    }
}
