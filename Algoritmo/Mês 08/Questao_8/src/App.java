
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        double A, B, C, delta, D, res1, res2;
        A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do coeficiênte A"));
        B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do coeficiênte B"));
        C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do coeficiênte C"));
        
        delta = (B*B)-4*A*C;
        D = Math.sqrt(delta);
        
        
        res1 = (-B+D)/(2*A);
        res2 = (-B-D)/(2*A);
        
        JOptionPane.showMessageDialog(null, "As raízes podem ser " + res1 + "ou " + res2);


    }
}
