package com.practicas.backend;

import java.util.Random;

import javax.swing.JOptionPane;

public class GuessTheNumber {
    int intRandom;
    int max = 100;
    int lives = 5;

    public void GuessNumber() {
        Random rand = new Random();
        intRandom = rand.nextInt(max);
    }

    public void PlayGame() {
        String userGuess = JOptionPane.showInputDialog(null, "Ingrese el numero para adivinar");
        int currGuess = Integer.parseInt(userGuess);
        int currNum = intRandom;
        if (currGuess == intRandom) {
            JOptionPane.showMessageDialog(null, "Adivinaste el numero, felicidades!!!");
            GuessNumber();
        } else if (currGuess > currNum) {
            JOptionPane.showMessageDialog(null, "El numero que ingresaste es mayor, vuelve a intentarlo");
            --lives;
        } else if (currGuess < currNum) {
            JOptionPane.showMessageDialog(null, "El numero que ingresaste es menor, vuelve a intentarlo");
            --lives;
        }

        if (lives < 0) {
            JOptionPane.showMessageDialog(null, "Tus vidas se terminaron, vuleve a intentarlo");
        } else {
            PlayGame();
        }
    }

    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null, "Presione aceptar para continuar");
        GuessTheNumber game = new GuessTheNumber();
        game.PlayGame();
    }
}
