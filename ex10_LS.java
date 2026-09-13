package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex10_LS {
    public void main(String args[])
    {
    double a,b;
    a = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
    b = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
    funDif(a,b);
    }
    
    public void funDif(double a,double b)
    {
    double dif;
    dif = a-b;
    JOptionPane.showMessageDialog(null, "A diferença é: "+dif);
    }
}
