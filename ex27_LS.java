package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex27_LS {
    public void main(String args[])
    {
    int volta,tamanho,tempo;
    double vel_media;
    volta = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de voltas"));
    tamanho = Integer.parseInt(JOptionPane.showInputDialog("insira o tamanho da pista"));
    tempo = Integer.parseInt(JOptionPane.showInputDialog("insira o tempo de duração"));
    
    vel_media = CalcVM(volta, tamanho,tempo);
    JOptionPane.showMessageDialog(null, "A velocidade media é: "+vel_media);
    }
    
    public double CalcVM(int v, int tm, int tem)
    {
    double vm;
    vm = ((double)tem*60)/((double)tm*v);
    
    return vm;
    }
}
