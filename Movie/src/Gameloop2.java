import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Gameloop2 {
    private ArrayList<Character> rightLetters;
    private ArrayList<Character> wrongLetters;
    private String movieName;

    Gameloop2(String movieName) {
        this.rightLetters = new ArrayList<Character>();
        this.wrongLetters = new ArrayList<Character>();
        this.movieName = movieName;
    }

    public void run() {
        String movie = this.movieName;
        char guessedLetter;

        String movieHidden = getMovieNameRevealed(movie, rightLetters);

        System.out.println("I have picked a movie for you to guess.");
        System.out.println("You are guessing: " + movieHidden);

        Scanner inputScanner = new Scanner(System.in);
        boolean hasWon = false;
        boolean hasLost = false;

        while (!hasWon && !hasLost) {
            System.out.println("Guess a letter: ");

            guessedLetter = inputScanner.next().charAt(0);

            if (rightLetters.contains(guessedLetter) || wrongLetters.contains(guessedLetter)) {
                System.out.println("You already guessed this letter");
            }
            else if (!Character.isLetter(guessedLetter)) {
                System.out.println("Please insert a letter");
            }
            else {
                if (movie.indexOf(guessedLetter) != -1) {
                    rightLetters.add(guessedLetter);
                } else {
                    wrongLetters.add(guessedLetter);
                }
            }
            System.out.println(this.getMovieNameRevealed(movie, rightLetters));

            String listOfWrongLetters = wrongLetters.stream().map(Object::toString).collect(Collectors.joining(", "));

            System.out.println("You have guessed " + wrongLetters.size() + " wrong letters: " + listOfWrongLetters);

            hasWon = this.hasWonGame(rightLetters, movie);
            hasLost = this.hasLostGame(wrongLetters);
        }

        if (hasWon) {
            System.out.println("YOU WON");
        } else if (hasLost) {
            System.out.println("YOU LOST, SOWWY");
            System.out.println("Correct movie was " + movie);
        }
    }

    public Boolean hasWonGame(ArrayList<Character> rightLetters, String movie){
        boolean hasWon = true;
        for (int i = 0; i < movie.length(); i++) {
            char currentLetter = movie.charAt(i);
            if (!rightLetters.contains(currentLetter) && currentLetter != ' ') {
                hasWon = false;
                break;
            }
        }
        return hasWon;
    }

    public Boolean hasLostGame(ArrayList<Character> wrongLetters){
        boolean hasLost = false;
        if (wrongLetters.size() > 5) {
            hasLost = true;
        };
        return hasLost;
    }

    public String getMovieNameRevealed(String movie, ArrayList<Character> rightLetters) {

        String movieHidden = movie.replaceAll("[a-zA-Z]", "_");

        for (int i = 0; i < movie.length(); i++) {
            char currentLetter = movie.charAt(i);
            if (rightLetters.contains(currentLetter)) {
                movieHidden = (movieHidden.substring(0, i) + currentLetter + movieHidden.substring(i + 1));
            }
        }
        return movieHidden;
    }

}
