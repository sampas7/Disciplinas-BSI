package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        double peso,alt,imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso (em quilos. Ex: 55)."));
        alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura (em metros. Ex: 1.78)."));

        imc = peso/(alt*alt);

        if (imc <= 18.5){

            JOptionPane.showMessageDialog(null, "Você está abaixo do peso. Seu IMC é: "+imc);

        }

        if (imc <= 25 && imc > 18.5){

            JOptionPane.showMessageDialog(null, "Você está com um peso normal. Seu IMC é: "+imc);

        }

        if (imc > 25 && imc <= 30){

            JOptionPane.showMessageDialog(null, "Você está com sobrepeso. Seu IMC é: "+imc);

        }

        if (imc > 30 && imc <= 35){

            JOptionPane.showMessageDialog(null, "Você é um obeso leve. Seu IMC é: "+imc);

        }

        if (imc > 35 && imc < 40){

            JOptionPane.showMessageDialog(null, "Você é um obeso moderado. Seu IMC é: "+imc);

        }

        if (imc >= 40){

            JOptionPane.showMessageDialog(null, "Você é um obeso mórbido. Seu IMC é: "+imc);
        }

    }
}
