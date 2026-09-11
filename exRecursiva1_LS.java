package com.mycompany.mavenproject2;
import javax.swing.JOptionPane;

public class exRecursiva1_LS {
    public static void main(String args[]){
    
        int num,fac;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para descobrir o fatorial: "));
        fac = FunRecursiva(num);
        JOptionPane.showMessageDialog(null,"O fatorial é:" + fac);
    }
    
    public static int FunRecursiva(int n){
    int x;
    if(n != 1){
    x = n * FunRecursiva(n-1);
    return x;
    }else{
    return n;
    }
    }
}
