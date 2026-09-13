package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex6_LS {
    public static void main(String args[])
    {
    int x,y,z;
    x = Integer.parseInt(JOptionPane.showInputDialog("insira x:"));
    y = Integer.parseInt(JOptionPane.showInputDialog("insira y:"));
    z=x;
    x=y;
    y=z;
    
JOptionPane.showMessageDialog(null, "A ordem do x e y é: "+x+" e "+y);
    }
}
