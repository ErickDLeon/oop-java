package com.game.bo;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private List<String> wrongLetters;
    private List<String> correctLetters;
    private List<String> movieLetters;
    private String movieWithOutSpaces;
    private static final int INTENTOS = 10;
    private String randomMovie;

    public Game() {
        wrongLetters = new ArrayList<>();
        correctLetters = new ArrayList<>();
        movieLetters = new ArrayList<>();
        movieWithOutSpaces = "";
        randomMovie = "";
    }

    public void play() {

        try {
            Scanner in = new Scanner(System.in);
            boolean hasWon = false;
            randomMovie = getRandomMovie();

            if (randomMovie == null) {
                System.out.println("No hay peliculas");
                in.close();
                return;
            }

            System.out.println("Adivina la pelicula:" + lines());

            System.out.println("Tienes " + INTENTOS + " intentos");

            for (int i = 0; i < INTENTOS; i++) {

                System.out.print("Intento: " + (i + 1) + " de " + INTENTOS + " - Adivina:");

                String cadena = in.nextLine();

                if (cadena.equals("0")) {
                    break;
                }

                if (!validate(cadena)) {
                    continue;
                }

                if (guessed(cadena) != -1) {
                    addCorrectLetters(cadena);
                    i--;
                } else {
                    wrongLetters.add(cadena);
                }

                if (compareLetters()) {
                    hasWon = true;
                    break;
                }

                System.out.println("Adivina la pelicula:" + guessedLines());
                System.out.println("letras incorrectas: " + wrongLetters.toString());

            }

            in.close();

            if (hasWon) {
                System.out.println("Ganaste: " + randomMovie);
            } else {
                System.out.println("Perdiste: " + randomMovie);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String guessedLines() {
        StringBuilder guessedLines = new StringBuilder();

        for (int i = 0; i < correctLetters.size(); i++) {
            guessedLines.append(" ");
            guessedLines.append(correctLetters.get(i));
        }

        return guessedLines.toString();
    }

    private boolean compareLetters() {
        StringBuilder guessed = new StringBuilder();

        for (int i = 0; i < correctLetters.size(); i++) {
            guessed.append(correctLetters.get(i));
        }

        String guessedWithOutScpaces = guessed.toString().replace(" ", "");

        return movieWithOutSpaces.equals(guessedWithOutScpaces);
    }

    private void addCorrectLetters(String cadena) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < movieLetters.size(); i++) {
            if (movieLetters.get(i).equals(cadena)) {
                indexes.add(i);
            }
        }

        for (int i = 0; i < indexes.size(); i++) {
            correctLetters.set(indexes.get(i), cadena);
        }
    }

    private boolean validate(String cadena) {
        boolean val = true;

        if (cadena.length() > 1) {
            System.out.println("Solo una letra");
            return false;
        }

        if (correctLetters.contains(cadena)) {
            System.out.println(cadena + " ya existe");
            return false;
        }

        if (wrongLetters.contains(cadena)) {
            System.out.println(cadena + " ya existe y era incorrecta");
            return false;
        }

        if (!cadena.matches("[a-zA-Z0]")) {
            System.out.println("Solo letras o \"0\" para salir");
            return false;
        }

        return val;
    }

    private String lines() {
        StringBuilder lines = new StringBuilder();

        for (int i = 0; i < randomMovie.length(); i++) {
            if (randomMovie.charAt(i) == ' ') {
                lines.append("  ");
                correctLetters.add(" ");
            } else {
                lines.append("_ ");
                correctLetters.add("_");
            }
        }

        return lines.toString();
    }

    private int guessed(String cadena) {
        return movieWithOutSpaces.indexOf(cadena);
    }

    private String getRandomMovie() {
        List<String> movies = Files.read();
        Random rand;

        try {
            rand = SecureRandom.getInstanceStrong();

            if (movies.isEmpty()) {
                return null;
            }

            int randomNumber = rand.nextInt(movies.size());

            randomMovie = movies.get(randomNumber);

            movieWithOutSpaces = randomMovie.replace(" ", "");

            for (int i = 0; i < randomMovie.length(); i++) {
                movieLetters.add(randomMovie.charAt(i) + "");
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

        return randomMovie;
    }
}