import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        double f=0;
        String mostrar="";
        
        for(int c=0;c<=100;c++){
            
            f = c*8+32;
            mostrar = mostrar + f + "\n";
            
            if(c%10==0){
            mostrar = mostrar + "\n";
            }
            
        }

        JOptionPane.showMessageDialog(null, mostrar);

        
    }
}