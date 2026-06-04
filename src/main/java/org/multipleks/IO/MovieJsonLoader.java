package org.multipleks.IO;

import org.multipleks.repertuar.Movie;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieJsonLoader {
    public static List<Movie> loadJsonMovies (String filePath){
        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File(filePath);
        List<Movie> movieList = mapper.readValue(jsonFile, new TypeReference<List<Movie>>() {});

        return movieList;
    }
}
