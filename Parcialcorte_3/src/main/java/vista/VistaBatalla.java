package vista;

public class VistaBatalla extends javax.swing.JFrame {

    public VistaBatalla() {
        initComponents();
    }

    public javax.swing.JButton getBtnAtacar() {
        return btnAtacar;
    }

    public javax.swing.JButton getBtnVerHistorial() {
        return btnVerHistorial;
    }

    public javax.swing.JLabel getLblLPJugador1() {
        return lblLPJugador1;
    }

    public javax.swing.JLabel getLblLPJugador2() {
        return lblLPJugador2;
    }

    public javax.swing.JTextField getTxtNombreM1() {
        return txtNombreM1;
    }

    public javax.swing.JTextField getTxtAtqM1() {
        return txtAtqM1;
    }

    public javax.swing.JTextField getTxtDefM1() {
        return txtDefM1;
    }

    public javax.swing.JTextField getTxtBonoM1() {
        return txtBonoM1;
    }

    public javax.swing.JComboBox<String> getCmbPosM1() {
        return cmbPosM1;
    }

    public javax.swing.JTextField getTxtNombreM2() {
        return txtNombreM2;
    }

    public javax.swing.JTextField getTxtAtqM2() {
        return txtAtqM2;
    }

    public javax.swing.JTextField getTxtDefM2() {
        return txtDefM2;
    }

    public javax.swing.JComboBox<String> getCmbPosM2() {
        return cmbPosM2;
    }

    public javax.swing.JCheckBox getChkAtaqueDirecto() {
        return chkAtaqueDirecto;
    }

    public javax.swing.JTextArea getTxtAreaLog() {
        return txtAreaLog;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelMarcador = new javax.swing.JPanel();
        lblLPJugador1 = new javax.swing.JLabel();
        lblLPJugador2 = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();
        panelAtacante = new javax.swing.JPanel();
        lblNombreM1 = new javax.swing.JLabel();
        txtNombreM1 = new javax.swing.JTextField();
        lblAtqM1 = new javax.swing.JLabel();
        txtAtqM1 = new javax.swing.JTextField();
        lblDefM1 = new javax.swing.JLabel();
        txtDefM1 = new javax.swing.JTextField();
        lblBonoM1 = new javax.swing.JLabel();
        txtBonoM1 = new javax.swing.JTextField();
        lblPosM1 = new javax.swing.JLabel();
        cmbPosM1 = new javax.swing.JComboBox<>();
        panelDefensor = new javax.swing.JPanel();
        lblNombreM2 = new javax.swing.JLabel();
        txtNombreM2 = new javax.swing.JTextField();
        lblAtqM2 = new javax.swing.JLabel();
        txtAtqM2 = new javax.swing.JTextField();
        lblDefM2 = new javax.swing.JLabel();
        txtDefM2 = new javax.swing.JTextField();
        lblPosM2 = new javax.swing.JLabel();
        cmbPosM2 = new javax.swing.JComboBox<>();
        lblDirecto = new javax.swing.JLabel();
        chkAtaqueDirecto = new javax.swing.JCheckBox();
        panelInferior = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        btnAtacar = new javax.swing.JButton();
        btnVerHistorial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yu-Gi-Oh! - Simulador Fase de Batalla");
        setMinimumSize(new java.awt.Dimension(780, 580));

        panelPrincipal.setBackground(new java.awt.Color(30, 36, 48));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 14, 14, 14));
        panelPrincipal.setLayout(new java.awt.BorderLayout(12, 12));

        panelEncabezado.setBackground(new java.awt.Color(21, 26, 36));
        panelEncabezado.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 12, 10, 12));
        panelEncabezado.setLayout(new java.awt.BorderLayout(0, 8));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(212, 175, 55));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("YU-GI-OH! — FASE DE BATALLA");
        panelEncabezado.add(lblTitulo, java.awt.BorderLayout.NORTH);

        panelMarcador.setBackground(new java.awt.Color(21, 26, 36));
        panelMarcador.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        lblLPJugador1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLPJugador1.setForeground(new java.awt.Color(88, 230, 156));
        lblLPJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLPJugador1.setText("Yugi - LP: 8000");
        panelMarcador.add(lblLPJugador1);

        lblLPJugador2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLPJugador2.setForeground(new java.awt.Color(255, 107, 107));
        lblLPJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLPJugador2.setText("Kaiba - LP: 8000");
        panelMarcador.add(lblLPJugador2);

        panelEncabezado.add(panelMarcador, java.awt.BorderLayout.CENTER);

        panelPrincipal.add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelCentro.setBackground(new java.awt.Color(30, 36, 48));
        panelCentro.setLayout(new java.awt.GridLayout(1, 2, 14, 0));

        panelAtacante.setBackground(new java.awt.Color(40, 48, 63));
        panelAtacante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monstruo Atacante (Jugador 1)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(212, 175, 55))); // NOI18N
        panelAtacante.setLayout(new java.awt.GridLayout(5, 2, 8, 8));

        lblNombreM1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreM1.setText("Nombre:");
        panelAtacante.add(lblNombreM1);

        txtNombreM1.setText("Mago Oscuro");
        panelAtacante.add(txtNombreM1);

        lblAtqM1.setForeground(new java.awt.Color(255, 255, 255));
        lblAtqM1.setText("Puntos de Ataque (ATQ):");
        panelAtacante.add(lblAtqM1);

        txtAtqM1.setText("2500");
        panelAtacante.add(txtAtqM1);

        lblDefM1.setForeground(new java.awt.Color(255, 255, 255));
        lblDefM1.setText("Puntos de Defensa (DEF):");
        panelAtacante.add(lblDefM1);

        txtDefM1.setText("2100");
        panelAtacante.add(txtDefM1);

        lblBonoM1.setForeground(new java.awt.Color(255, 255, 255));
        lblBonoM1.setText("Bono Efecto (0 = Normal):");
        panelAtacante.add(lblBonoM1);

        txtBonoM1.setText("0");
        panelAtacante.add(txtBonoM1);

        lblPosM1.setForeground(new java.awt.Color(255, 255, 255));
        lblPosM1.setText("Posición:");
        panelAtacante.add(lblPosM1);

        cmbPosM1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATAQUE", "DEFENSA" }));
        panelAtacante.add(cmbPosM1);

        panelCentro.add(panelAtacante);

        panelDefensor.setBackground(new java.awt.Color(40, 48, 63));
        panelDefensor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monstruo Defensor (Jugador 2)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(212, 175, 55))); // NOI18N
        panelDefensor.setLayout(new java.awt.GridLayout(5, 2, 8, 8));

        lblNombreM2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreM2.setText("Nombre:");
        panelDefensor.add(lblNombreM2);

        txtNombreM2.setText("Dragón Blanco");
        panelDefensor.add(txtNombreM2);

        lblAtqM2.setForeground(new java.awt.Color(255, 255, 255));
        lblAtqM2.setText("Puntos de Ataque (ATQ):");
        panelDefensor.add(lblAtqM2);

        txtAtqM2.setText("3000");
        panelDefensor.add(txtAtqM2);

        lblDefM2.setForeground(new java.awt.Color(255, 255, 255));
        lblDefM2.setText("Puntos de Defensa (DEF):");
        panelDefensor.add(lblDefM2);

        txtDefM2.setText("2500");
        panelDefensor.add(txtDefM2);

        lblPosM2.setForeground(new java.awt.Color(255, 255, 255));
        lblPosM2.setText("Posición:");
        panelDefensor.add(lblPosM2);

        cmbPosM2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATAQUE", "DEFENSA" }));
        panelDefensor.add(cmbPosM2);

        lblDirecto.setForeground(new java.awt.Color(255, 255, 255));
        lblDirecto.setText("Sin defensores:");
        panelDefensor.add(lblDirecto);

        chkAtaqueDirecto.setBackground(new java.awt.Color(40, 48, 63));
        chkAtaqueDirecto.setForeground(new java.awt.Color(212, 175, 55));
        chkAtaqueDirecto.setText("Ataque Directo");
        panelDefensor.add(chkAtaqueDirecto);

        panelCentro.add(panelDefensor);

        panelPrincipal.add(panelCentro, java.awt.BorderLayout.CENTER);

        panelInferior.setBackground(new java.awt.Color(30, 36, 48));
        panelInferior.setLayout(new java.awt.BorderLayout(0, 10));

        panelBotones.setBackground(new java.awt.Color(30, 36, 48));
        panelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 16, 6));

        btnAtacar.setBackground(new java.awt.Color(212, 175, 55));
        btnAtacar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAtacar.setForeground(new java.awt.Color(21, 26, 36));
        btnAtacar.setText("Ejecutar Combate");
        panelBotones.add(btnAtacar);

        btnVerHistorial.setBackground(new java.awt.Color(61, 73, 92));
        btnVerHistorial.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVerHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHistorial.setText("Cargar Historial (.txt)");
        panelBotones.add(btnVerHistorial);

        panelInferior.add(panelBotones, java.awt.BorderLayout.NORTH);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Batalla / Historial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(212, 175, 55))); // NOI18N

        txtAreaLog.setEditable(false);
        txtAreaLog.setBackground(new java.awt.Color(21, 26, 36));
        txtAreaLog.setColumns(20);
        txtAreaLog.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtAreaLog.setForeground(new java.awt.Color(235, 235, 235));
        txtAreaLog.setRows(7);
        jScrollPane1.setViewportView(txtAreaLog);

        panelInferior.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelPrincipal.add(panelInferior, java.awt.BorderLayout.SOUTH);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnVerHistorial;
    private javax.swing.JCheckBox chkAtaqueDirecto;
    private javax.swing.JComboBox<String> cmbPosM1;
    private javax.swing.JComboBox<String> cmbPosM2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtqM1;
    private javax.swing.JLabel lblAtqM2;
    private javax.swing.JLabel lblBonoM1;
    private javax.swing.JLabel lblDefM1;
    private javax.swing.JLabel lblDefM2;
    private javax.swing.JLabel lblDirecto;
    private javax.swing.JLabel lblLPJugador1;
    private javax.swing.JLabel lblLPJugador2;
    private javax.swing.JLabel lblNombreM1;
    private javax.swing.JLabel lblNombreM2;
    private javax.swing.JLabel lblPosM1;
    private javax.swing.JLabel lblPosM2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelAtacante;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelDefensor;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelMarcador;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextArea txtAreaLog;
    private javax.swing.JTextField txtAtqM1;
    private javax.swing.JTextField txtAtqM2;
    private javax.swing.JTextField txtBonoM1;
    private javax.swing.JTextField txtDefM1;
    private javax.swing.JTextField txtDefM2;
    private javax.swing.JTextField txtNombreM1;
    private javax.swing.JTextField txtNombreM2;
    // End of variables declaration//GEN-END:variables
}
