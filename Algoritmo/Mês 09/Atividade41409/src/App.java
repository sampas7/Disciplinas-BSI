import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String mostrar ="";
        int n=0,p=0;
        
        for(int j=55,i=50;i<j;i--,j--){

            n = n +1;

            if(j == 2*i){

                p = n-1;
            }

        }

        JOptionPane.showMessageDialog(null, p);
    }
}
