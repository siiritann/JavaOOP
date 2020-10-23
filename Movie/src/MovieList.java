import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;




public class MovieList {

    ArrayList<String> moviesFromFile = new ArrayList<String>();

    public String movieFromFile(int lineNo) {

        // open file
        File file = new File("movies.txt");

        try {
            Scanner fileScanner = new Scanner(file);

            // compile new array for movies

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                moviesFromFile.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }

        return moviesFromFile.get(lineNo);

    }
}
