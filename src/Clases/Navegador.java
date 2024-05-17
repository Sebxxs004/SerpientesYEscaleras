package Clases;

import GUI.*;

public class Navegador {
    public principalPage index;
    public infoPage info;
    public Frame tablero;
    public Navegador() {
        info = new infoPage(this);
        index = new principalPage(this);
        tablero = new Frame(this);
    }
}
