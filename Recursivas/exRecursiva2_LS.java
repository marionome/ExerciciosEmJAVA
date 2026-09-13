package com.mycompany.mavenproject2;
import javax.swing.JOptionPane;

public class exRecursiva2_LS {
    public static void main(String args[]){
    int num = 100;
    int resultado;
    
    resultado = funRecursiva(num);
    JOptionPane.showMessageDialog(null, resultado);
    
    }
    
    public static int funRecursiva(int n){
     int res;
     if(n>0){
         res = n + funRecursiva(n-1);
         return res;
     }
     else{
         return n;
        }
    }
}
