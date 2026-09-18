package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex20_LS {
    
    public static void main(String args[])
    {
        int a,b,c,delta;
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de b:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de c:"));
        delta = CalcDelta(a,b,c);
        if (delta<0)
        {
            JOptionPane.showMessageDialog(null, "A equação não possui raizes reais");
        }
        else
        {
        CalcRaiz(a, b, delta);
        }
        
    }
    
    public static int CalcDelta(int a,int b, int c)
    {
        return ((b*b) - (4*a*c));
    }
    
    public static void CalcRaiz(int a, int b, int delta)
    {
        double raiz1 = (-b + Math.sqrt(delta))/(2*a);
        double raiz2 = (-b - Math.sqrt(delta))/(2*a);
        
        JOptionPane.showMessageDialog(null, "Primeira raiz:"+raiz1+"\nSegunda raiz:"+raiz2);
    }
}