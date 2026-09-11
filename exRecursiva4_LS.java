import javax.swing.JOptionPane;
public class exRecursiva4_LS {
    
    public static void main(String args[])
    {
        int n,r;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        r = funRecursiva(n);
        JOptionPane.showMessageDialog(null, r);
    }
    
    public static int funRecursiva(int n){
        if (n>1){
        return n + funRecursiva(n-1);
        }
        else{
        return n;
        }
    }
}
