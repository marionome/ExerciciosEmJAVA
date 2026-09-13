package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ex16_LS {
    public void main(String args[])
    {
    int hor_trab, dep;
    double valor_hor,desconto, sal_liquido, sal_bruto;
    
    hor_trab = Integer.parseInt(JOptionPane.showInputDialog("Insira as horas trabalhadas"));
    valor_hor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor das horas trabalhadas"));
    desconto = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto"));
    dep = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidades de dependentes"));
    
    sal_bruto = CalcBruto(hor_trab,valor_hor);
    sal_liquido = CalcLiquido(sal_bruto, desconto,dep);
    JOptionPane.showMessageDialog(null, "O salario liquido ficou: "+sal_liquido);
    }
    
    public double CalcBruto(int horas,double valor)
    {
    return horas*valor;
    }
    
    public double CalcLiquido(double sal, double descon, int dep)
    {
    sal = sal + (sal*descon);
    sal = sal +(dep*100);
    return sal;
    }
}
