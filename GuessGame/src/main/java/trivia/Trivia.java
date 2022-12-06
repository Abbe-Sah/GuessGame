package trivia;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trivia  {

    static Query query = new Query();
    static List<Query> queries = new ArrayList<>();


    public static void loadTrivia() throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(
                "/resources/com/guessgameschool/guessgame/trivia.csv"));

        while ((line = br.readLine()) != null) {
            // seprator ",".
            String[] cols = line.split(",");
            query.setSubject(cols[0]);
            query.setQuery(cols[1]);
            query.setCorrectAnswer(cols[2]);
            queries.add(query);
        }
    }

    public static String randomQuery() {
        List<String> lines;
        try {
            lines = Files.readAllLines(
                    Path.of("/resources/com/guessgameschool/guessgame/trivia.csv"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        Random random = new Random();
        return lines.get(random.nextInt(lines.size()));
    }

}
