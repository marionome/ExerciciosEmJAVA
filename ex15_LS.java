package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex15_LS {
    public void main(String args[])
    {
    int c1,c2;
    double hip;
    c1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o cateto"));
    c2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o cateto"));
    hip = CalcHipotenusa(c1,c2);
    JOptionPane.showMessageDialog(null, "A hipotenusa é: "+hip);
    }
    public static double CalcHipotenusa(int c1,int c2)
    {
    return Math.sqrt((c1*c1)+(c2*c2));
    }
    
}
