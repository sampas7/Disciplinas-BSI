import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        char  cont;
        String mostrar="";
        
        for(cont=0;cont<256;cont++){

            mostrar = mostrar + "\nO valor correspondido na tabela ASCII é " + cont;

            JOptionPane.showMessageDialog(null, mostrar);
        }  

    }
}

