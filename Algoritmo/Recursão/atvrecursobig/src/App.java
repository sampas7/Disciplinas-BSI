import javax.swing.JOptionPane;

public class App {

    public static int soma (int x){

        if (x == 0)
            return 1;
        else
            return x * soma(x-1);

    }

    public static void main(String[] args) throws Exception {

        int fat;

        fat = Integer.parseInt(JOptionPane.showInputDialog(null, ""));

    }
}
