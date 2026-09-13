package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class ex17_LS {
    
    public void main(String args[])
    {
    int tempo;
    double vel_media, litros;
    tempo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo gasto no percurso(em horas)"));
    vel_media = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade media(em km/h)"));
    
    litros = CalcDist(tempo,vel_media);
    JOptionPane.showMessageDialog(null, "A quantidade de litros gastas foi "+litros+" litros");
    
    }
    
    public double CalcDist(int tempo,double vm)
    {
        double lis;
        lis = (tempo*vm)/12;
        return lis;
    }
}
