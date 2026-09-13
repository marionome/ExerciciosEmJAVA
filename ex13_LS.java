package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex13_LS {
public void main(String args[])
{
    int kg;
    kg = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade alimento em kilos"));
    CalcCons(kg);
}    

public void CalcCons(int kg)
{
   double dias;
   dias = kg/0.05;
   JOptionPane.showMessageDialog(null, "A comida durara "+dias+" dias");
}
}