package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex25_LS {
    public static void main(String args[])
    {
    int hr_ini,hr_fin,mn_ini,mn_fin;
    
    do{
    hr_ini = Integer.parseInt(JOptionPane.showInputDialog("Insira as horas de inicio"));
    mn_ini = Integer.parseInt(JOptionPane.showInputDialog("Insira os minutos de inicio"));
    hr_fin = Integer.parseInt(JOptionPane.showInputDialog("Insira as horas que terminou"));
    mn_fin = Integer.parseInt(JOptionPane.showInputDialog("Insira os minutos que terminou"));
    }while((hr_ini>=24)&&(hr_fin>=24)&&(mn_ini>=59)&&(mn_fin>=59));
    
    CalcHora(hr_ini,mn_ini,hr_fin,mn_fin);
    }
    
    public static void CalcHora(int hr_ini,int mn_ini,int hr_fin,int mn_fin)
    {
    int hr_res,mn_res;
    if(hr_ini>hr_fin)
        {
        hr_fin += 24;
        }    
    hr_res = hr_fin-hr_ini;
        
    
    if(mn_ini>mn_fin)
        {
        hr_res-=1;
        mn_fin+=60;    
        }
    mn_res = mn_fin-mn_ini;
    
    JOptionPane.showMessageDialog(null, "A duração do jogo foi de:\n"+hr_res+"hr "+mn_res+"mn");
    
    }
}
