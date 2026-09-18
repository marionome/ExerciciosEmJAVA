package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex21_LS {
    
    public void main(String args[])
    {
    double n1,n2,n3,n4,media;
    n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 1° nota"));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 2° nota"));
    n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 3° nota"));
    n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 4° nota"));
    
    media = calcMedia(n1,n2,n3,n4);
    funcEstado(media);
    }
    
    public double calcMedia(double n1,double n2, double n3, double n4)
    {
    return (n1+n2+n3+n4)/4;
    }
    
    public void funcEstado(double media)
    {
    if(media >=6)
    {
        JOptionPane.showMessageDialog(null, "sua media: "+media+"\nAPROVADO");
    }
    else
    {
        if(media>=3)
        {
            JOptionPane.showMessageDialog(null, "sua media: "+media+"\nEXAME");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "sua media: "+media+"\nRETIDO");
        }
    }
    }
}
