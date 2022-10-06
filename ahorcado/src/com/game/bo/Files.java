package com.game.bo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Files {

    private Files() {
        
    }

    public static List<String> read() {
        List<String> movies = new ArrayList<>();
        try (
            FileReader file = new FileReader("movies.txt");
            BufferedReader bf = new BufferedReader(file);
        ) {
            if (bf.ready()) {
                movies.addAll(bf.lines().toList());
            }

        } catch (Exception e) {
            System.err.println("Error al obtener archivo");
            return Collections.emptyList();
        }

        return movies;
    }
}
