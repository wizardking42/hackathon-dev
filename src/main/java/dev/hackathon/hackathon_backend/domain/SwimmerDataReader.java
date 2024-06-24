package dev.hackathon.hackathon_backend.domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class SwimmerDataReader {
    private static final String FILE_PATH = "src/main/resources/NATATION_Finales_CM_JO_2019_2024_.csv";

    public Stream<SwimmerPerformance> readData() {
        try {
            return Files.lines(Paths.get(FILE_PATH))
                    .skip(1) // skip the header line
                    .map(line -> line.split(","))
                    .map(SwimmerPerformance::new);
        } catch (IOException e) {
            throw new RuntimeException("Error reading file " + FILE_PATH, e);
        }
    }
}
