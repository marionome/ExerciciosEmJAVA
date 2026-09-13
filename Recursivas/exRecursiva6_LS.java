import javax.swing.JOptionPane;

public class exRecursiva6_LS {
    public static void main(String args[])
    {
    double n,r;
    n = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero: "));
    r = funcRecursiva(n,1);
    JOptionPane.showMessageDialog(null, r);
    }
    
    public static double funcRecursiva(double n,double i)
    {
        if (n>1)
        {
        return (n/i)+funcRecursiva(n-1,i+1);
        }
        else
        {
        return (n/i);
        }
    }
}
