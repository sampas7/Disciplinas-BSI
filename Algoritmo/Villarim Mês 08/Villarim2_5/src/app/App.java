package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double dist,comb,result;

        dist = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a distância em km."));
        comb = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o combustível gasto em litros."));

        result = dist/comb;

        if (result <= 15){

            JOptionPane.showMessageDialog(null, "Seu veículo é econômico. São percorridos "+result+"km/l.");

        }

            else{

                JOptionPane.showMessageDialog(null, "Seu veículo não é econômico. São percorridos "+result+"km/l.");
            }

    }
}
