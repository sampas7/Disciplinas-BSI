import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
    String mostrar ="";
    int n=0;

    for(int i=100; i > 0; i=i-2){

        n = n+i;
    }

    mostrar = mostrar + n;

    JOptionPane.showMessageDialog(null, mostrar);
}
}
