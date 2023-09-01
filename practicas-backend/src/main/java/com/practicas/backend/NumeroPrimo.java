package com.practicas.backend;

import javax.swing.JOptionPane;

public class NumeroPrimo {
    public static void main(String[] args) {
        String amount = JOptionPane.showInputDialog(null, "Por favor ingrese un número");

        boolean isPrime = Integer.parseInt(amount) % 2 == 0;

        if (isInt(amount) && !isPrime) {
            JOptionPane.showMessageDialog(null, "El número " + amount + " es un número primo");
        }
        if (!isInt(amount)) {
            JOptionPane.showMessageDialog(null,
                    "La cantidad ingresada es incorrecta, por favor ingrese un número entero",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad " + amount + " ingresada no es un número primo");
        }

    }

    public static boolean isInt(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
