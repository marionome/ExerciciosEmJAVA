package com.mycompany.mavenproject2;
import javax.swing.JOptionPane;

public class ex_Recursiva3_LS {
    public static void main(String args[])
    {
    double n,r;
    n = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero cacete: "));
    r = funcRecursiva(n);
    JOptionPane.showMessageDialog(null,r); 
    }
    public static double funcRecursiva(double n)
    {
        if (n > 1)
        {
            return (1/n) + funcRecursiva(n-1);
        } 
        else{
            return (1/n);
        }
    }
}
