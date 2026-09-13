package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex11_LS {
    public void main(String args[])
    {
    int raio;
    raio = Integer.parseInt(JOptionPane.showInputDialog("Insira o raio:"));
    funcCircu(raio);
    }
    
    public void funcCircu(int r)
    {
    double circ;
    circ = r*3.14*2;
    JOptionPane.showMessageDialog(null, "a circuferencia é: "+circ);
    }
}
