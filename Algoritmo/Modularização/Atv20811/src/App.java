import javax.swing.JOptionPane;

public class App {

    public static double dist(double dist1){

        double dist;
        dist = dist1;
        dist1 = 100*0.5;
        return dist1;
    }

    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "A distância percorrida foi: " + dist(dist(0)));
        
    }
}
