package GUI;

import Clases.*;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Toolkit;

public class Frame extends JFrame {
    Navegador Nav;
    public Frame(Navegador n){
        Nav = n;
    }
    public Frame() {
        TableroAvanzado tablero1 = new TableroAvanzado((int) (Nav.info.numeroCasillas), Nav.index.jugador, Nav.index.casilla1, (int) Nav.info.numeroJugadores);
        Titulo titulo1 = new Titulo();
        getContentPane().add(tablero1, BorderLayout.CENTER);
        setTitle("Tablero");
        getContentPane().add(titulo1, BorderLayout.NORTH);
        setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void ejecutarFrame() {
        Frame frame = new Frame();
        frame.setVisible(true);
    }
}

