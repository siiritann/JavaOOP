import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Gameloop {
    private ArrayList<Character> rightLetters;
    private ArrayList<Character> wrongLetters;
    private String movieName;

    Gameloop(String movieName) {
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
        while (!this.isGameOver(rightLetters, wrongLetters, movie)) {

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
        }
    }

    public Boolean isGameOver(ArrayList<Character> rightLetters, ArrayList<Character> wrongLetters, String movie) {

        boolean hasWon = true;
        boolean hasLost = false;

        for (int i = 0; i < movie.length(); i++) {
            char currentLetter = movie.charAt(i);
            if (!rightLetters.contains(currentLetter) && currentLetter != ' ') {
                hasWon = false;
                break;
            }
        }

        if (wrongLetters.size() > 5) {
            hasLost = true;
        }

        if (hasWon) {
            System.out.println("YOU WON");
        } else if (hasLost) {
            System.out.println("YOU LOST, SOWWY");
            System.out.println("Correct movie was " + movie);
        }

        return hasLost || hasWon;
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
