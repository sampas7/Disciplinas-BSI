import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {
        String mostrar="";

        int contador, cont;

        for(contador=0;contador < 3;contador++){

            for(cont = 0; cont < 5;cont++){

                mostrar = mostrar + cont + "";
            }
        }

        JOptionPane.showMessageDialog(null, mostrar);
    }
}
