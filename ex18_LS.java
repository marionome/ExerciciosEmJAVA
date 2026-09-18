package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class ex18_LS {
    public void main(String args[])
    {
    int a,b;
    a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
    b = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
    funDif(a,b);
    }
    public void funDif(int a, int b)
    {
    int diferen;
    if (a>b)
        {
            diferen = a - b;
            JOptionPane.showMessageDialog(null,"a diferença entre os dois valores é de "+ diferen);
        }
    else
        {
        diferen = b - a;
        JOptionPane.showMessageDialog(null,"a diferença entre os dois valores é de "+ diferen);
        
        }
    }
}
