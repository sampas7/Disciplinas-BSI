import javax.swing.JOptionPane;

public class App {


    public static void main(String[] args) {

        int contador = 0;
        String numero="";

        while(contador < 10){

            numero = numero + contador;
            contador = contador + 1;

        }

        JOptionPane.showMessageDialog(null, numero);

    }
}
