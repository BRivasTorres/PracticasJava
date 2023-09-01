package com.practicas.backend;

import javax.swing.JOptionPane;

public class ConversionMonetaria {
    public static void main(String[] args) {
        String cantidad = JOptionPane.showInputDialog(null, "Ingrese una cantidad a convertir");
        double cambio = 0.13;

        boolean isNumber = false;

        do {
            String cantidadStr = cantidad;
            if (cantidadStr.matches("\\d+")) {
                isNumber = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "La cantidad ingresada no es correcta, por favor ingrese solamente numeros.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        } while (!isNumber);

        double cantidadFinal = Double.parseDouble(cantidad) * cambio;

        JOptionPane.showMessageDialog(null, "El cambio de Quetzales a Dolares es " + cantidadFinal);
    }
}
