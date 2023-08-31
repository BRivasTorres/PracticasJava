package com;

import javax.swing.JOptionPane;

public class SumadDosNumeros {
    public static void main(String[] args) {
        String cantidadString1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero para ser sumado");
        String cantidadString2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero para ser sumado");

        if (!isNumber(cantidadString1)) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese solamente numeros en la cantidad 1");
            return;
        }

        if (!isNumber(cantidadString2)) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese solamente numeros en la cantidad 2");
            return;
        }

        double cantidad1 = Double.parseDouble(cantidadString1);
        double cantidad2 = Double.parseDouble(cantidadString2);

        double cantidadTotal = cantidad1 + cantidad2;

        JOptionPane.showMessageDialog(null, "La cantidad total es " + cantidadTotal);
    }

    public static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
