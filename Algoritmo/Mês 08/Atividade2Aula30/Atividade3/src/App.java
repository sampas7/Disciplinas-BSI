import javax.swing.JOptionPane;

//essa é a questão 3.

public class App {
    public static void main(String[] args) {

        String relatorio="", mostrar1="",mostrar2="";
        double alt1, alt2, alt3,media;

        alt1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeira altura"));
        alt2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Segunda altura"));
        alt3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Terceira altura"));

        // calcular menor altura
        if((alt1 < alt2) && (alt1 < alt3)){

            mostrar1 = mostrar1 + alt1;
        }

        else if((alt2 < alt1) && (alt2 < alt3)){

            mostrar1 = mostrar1 + alt2;
        }

        else {

            mostrar1 = mostrar1 + alt3;
        }

        //calcular maior altura
        if((alt1 > alt2) && (alt1 > alt3)){

            mostrar2 = mostrar2 + alt1;
        }

        else if((alt2 > alt1) && (alt2 > alt3)){

            mostrar2 = mostrar2 + alt2;
        }

        else {

            mostrar2 = mostrar2 + alt3;
        }

        //calcular média
        media = (alt1 + alt2 + alt3)/3;

        relatorio = JOptionPane.showInputDialog(null,"Visualizar relatório?");

        while(relatorio.equals("sim")){

            JOptionPane.showMessageDialog(null,"Menor altura: " + mostrar1 + "\n" + "Maior altura: " + mostrar2 + "\n\n" + "Média das alturas: " + media);
            relatorio = JOptionPane.showInputDialog(null,"Visualizar novamente?");
        }
    }
}


