/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Clases.Jugador;
import Clases.Navegador;
import javax.swing.JOptionPane;

public class infoPage extends javax.swing.JFrame {
    int numeroCasillas, numeroJugadores;
    Navegador Nav;
    Jugador []jugador;
    public infoPage(Navegador n) {
        initComponents();
        numeroCasillas = 0;
        numeroJugadores = 0;
        Nav = n;
        
    }

    public int getNumeroCasillas() {
        return numeroCasillas;
    }

    public void setNumeroCasillas(int numeroCasillas) {
        this.numeroCasillas = numeroCasillas;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgPlayers = new javax.swing.ButtonGroup();
        cbTamaño = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbFour = new javax.swing.JRadioButton();
        rbTwo = new javax.swing.JRadioButton();
        rbThree = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rbBot = new javax.swing.JRadioButton();
        btnPlay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbTamaño.setBackground(new java.awt.Color(0, 102, 0));
        cbTamaño.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbTamaño.setForeground(new java.awt.Color(255, 255, 255));
        cbTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10x10 (Default)", "13x13", "15x15" }));
        cbTamaño.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(cbTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 310, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("CANTIDAD DE JUGADORES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tamaño de el tablero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 200, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4P.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2P.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3P.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        btgPlayers.add(rbFour);
        rbFour.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbFour.setText("4 JUGADORES");
        rbFour.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(rbFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 160, 50));

        btgPlayers.add(rbTwo);
        rbTwo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbTwo.setText("2 JUGADORES");
        rbTwo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(rbTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 160, 50));

        btgPlayers.add(rbThree);
        rbThree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbThree.setText("3 JUGADORES");
        rbThree.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(rbThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 160, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botPlayer.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        btgPlayers.add(rbBot);
        rbBot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbBot.setText("CONTRA LA PC");
        rbBot.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(rbBot, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 160, 50));

        btnPlay.setBackground(new java.awt.Color(0, 102, 0));
        btnPlay.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(255, 255, 255));
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playGame.png"))); // NOI18N
        btnPlay.setText("CONTINUAR");
        btnPlay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 620, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inicialPage.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        switch(cbTamaño.getSelectedIndex()){
            case 0:
                numeroCasillas = 10*10;
                System.out.println("Tamaño CASILLAS:100");
                break;
            case 1:
                numeroCasillas = 13*13;
                System.out.println("Tamaño CASILLAS:169");
                break;
            case 2:
                numeroCasillas = 15*15;
                System.out.println("Tamaño CASILLAS:225");
                break;
        }
        if(rbTwo.isSelected() == false && rbThree.isSelected() == false && rbFour.isSelected() == false && rbBot.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Por favor, seleccione la cantidad de jugadores");
        } else if(rbTwo.isSelected()){
            numeroJugadores = 2;
            Nav.index.panelPlayer3.setVisible(false);
            Nav.index.panelPlayer4.setVisible(false);
            System.out.println("2PLAYERS inciado");
            this.setVisible(false);
            System.out.println(numeroJugadores);
            Nav.index.setVisible(true);
        } else if(rbThree.isSelected()){
            numeroJugadores = 3;
            Nav.index.panelPlayer4.setVisible(false);
            this.setVisible(false);
            System.out.println(numeroJugadores);
            Nav.index.setVisible(true);
        } else if(rbFour.isSelected()){
            numeroJugadores = 4;
            this.setVisible(false);
            System.out.println(numeroJugadores);
            Nav.index.setVisible(true);
        } else {
            numeroJugadores = 1;
            Nav.index.panelPlayer2.setVisible(false);
            Nav.index.panelPlayer3.setVisible(false);
            Nav.index.panelPlayer4.setVisible(false);
            this.setVisible(false);
            System.out.println(numeroJugadores);
            Nav.index.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnPlayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgPlayers;
    private javax.swing.JButton btnPlay;
    private javax.swing.JComboBox<String> cbTamaño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbBot;
    private javax.swing.JRadioButton rbFour;
    private javax.swing.JRadioButton rbThree;
    private javax.swing.JRadioButton rbTwo;
    // End of variables declaration//GEN-END:variables
}
