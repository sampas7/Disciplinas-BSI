import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) throws Exception {

        int votos[] = new int[10];

        int cont1=0, cont2=0, cont3=0, cont4=0;
        String contar1="", contar2="", contar3="", contar4="";
        String conta1="", conta2="";

        for(int a = 0; a < 10; a++){

            votos[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Em qual candidato irá votar?\n\n 1. Luís\n 2. José\n 3.Voto Branco"));

        }

        for(int b = 0; b < 10; b++){

            if(votos[b] == 1){

                cont1++;

            }

            else if(votos[b] == 2){

                cont2++;

            }

            else if(votos[b] == 3){

                cont3++;

            }

            else {

                cont4++;

            }


        }


            if(cont1 > cont2){

                conta1 += "Luís ganhou a votação.";

                JOptionPane.showMessageDialog(null, conta1);

            }

            else if (cont2 > cont1){


                conta2 += "José ganhou a votação.";

                JOptionPane.showMessageDialog(null, conta2);

            }

            else {

                JOptionPane.showMessageDialog(null, "Votação anulada.");

            }

            contar1 += "O candidato Luís obteve " + cont1 + " votos.";
            contar2 += "O candidato José obteve " + cont2 + " votos.";
            contar3 += "Quantidade de votos branco: " + cont3 + " votos.";
            contar4 += "Votos anulados: " + cont4 + " votos.";
            

            JOptionPane.showMessageDialog(null, "Resultado: \n\n" + contar1 + "\n" + contar2 + "\n" + contar3 + "\n" + contar4);

        }

    }

