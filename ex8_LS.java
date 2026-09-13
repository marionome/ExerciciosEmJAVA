package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex8_LS {
    public void main(String args[])
    {
    double val,pou;
    val = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do deposito:"));
    pou = CalcPoupa(val);
    JOptionPane.showMessageDialog(null, "Depois de um mes, o valor sera: "+pou);
    }
    
    public static double CalcPoupa(double val)
    { 
    double p;
    p = val + (val*0.15);
    return p;
    }
}
