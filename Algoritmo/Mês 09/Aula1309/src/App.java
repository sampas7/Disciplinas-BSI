import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String mostrar="";

        for (int i=1,j=7; i<=j;i++,j--){

            if(i == j)
            mostrar = mostrar + i;

        }

        JOptionPane.showMessageDialog(null, mostrar);

    }
}
