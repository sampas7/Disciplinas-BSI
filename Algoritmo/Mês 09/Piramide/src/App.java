import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollPaneUI;

public class App {
    public static void main(String[] args){

        String mostrar="";

        for(int i = 1; i <10;i=i+2){

            for(int j = 0; j<i;j++){

                if(j==0 && i == 1){

                    mostrar = mostrar + "     +";

                }
                else if(j == 0 && i == 3){

                    mostrar = mostrar + "   +";

                }

                else if(j == 0 && i == 5){

                    mostrar = mostrar + "  +";

                }

                else if(j == 0 && i == 7){

                    mostrar = mostrar + " +";

                }

                else{

                    mostrar = mostrar + "+";
                }



            }

                
            mostrar = mostrar+"\n";

            JOptionPane.showMessageDialog(null, mostrar);

        }

    }
}
