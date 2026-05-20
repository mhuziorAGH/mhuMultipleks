package org.multipleks.IO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieLoader {

    public static List<String> loadMovies(String filePath) {
        List<String> movies = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line = reader.readLine();

            if (line != null) {
                String[] splitMovies = line.split(", ");

                for (String movie : splitMovies) {
                    movies.add(movie);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return movies;
    }
}