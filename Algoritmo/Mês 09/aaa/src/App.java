import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class App {
    public static void main(String[] args)  {

        int idade [] = new int[5];

        for(int a = 0; a <5; a++){

            idade[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "num"));
            
        }

    }
}
