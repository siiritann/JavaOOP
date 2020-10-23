import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int randomNo = (int) (Math.random() * 24);    // generate random number
        MovieList myMovieList = new MovieList();
//        String movie = myMovieList.movieFromFile(randomNo);
        String movie = "l e";

        Gameloop2 gameloop = new Gameloop2(movie);
        gameloop.run();
    }
}
