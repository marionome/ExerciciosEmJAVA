package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class ex14_LS {
    public void main(String args[])
    {
    int valor1,valor2;
    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o angulo:"));
    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o angulo:"));
    calcAngulo(valor1,valor2);
    }
    
    public void calcAngulo(int v1,int v2)
    {
    int v3;
    v3 = 180 - (v1+v2);
    JOptionPane.showMessageDialog(null, "O valor do terceiro angulo é: "+v3);
    }
}
