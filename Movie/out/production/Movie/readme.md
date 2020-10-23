Thoughts for future

1. refacto getMovieNameRevealed loogika vastupidiseks: kui ei ole õige täht siis panen alakriipsu, prg igas
iteratsioonis alakriipsustab



//Part I
//1. hardcode any word
//2. game loopi koos tähtede arvamisega
//
//Part II
//3. add underscore logic
//
//Part III
//4. File-ist rea lugemine
//
//Part IV
//5. assemble
//
//
//1. read from file - DONE
//2. compile films array - DONE
//3. get random movie - DONE
//4. Show it - DONE
//
//5. guess a letter - correct + return updated underscore movie
//6. guess a letter - incorrect  + lose points
//7. declare win
//8. declare loss
//
//*/
//
//import java.io.File;
//import java.util.*;
//
//public class Movie {
//    public static void main(String [] args) throws Exception {
//
//        // count number of movies in file
//        int itemCount = movies.size();
//        System.out.println(itemCount);
//
//        // pick random movie from file
//
//        int randomNo = (int) (Math.random() * 10);    // generate random number
//        String randomMovie = movies.get(randomNo);
//
//        System.out.println(randomMovie); //ForTesting
//
//        // show user how many letters are in this Movie
//
//        int count = 0;
//        for (int i = 0; i < randomMovie.length(); i++) {
//            if (Character.isLetter(randomMovie.charAt(i)))
//                count++;
//        }
//        System.out.println("This movie has " + count + " letters in it.");
//
//
//        // convert its letters to underscores (_) and display that instead
//
//        String randomMovieHidden = randomMovie.replaceAll("[a-zA-Z]", "_");
//        System.out.println(randomMovieHidden);
//
//
//        // user guesses
//
//        String rightLetters = "";
//        String wrongLetters = "";
//
////        ArrayList<String> rightLetters = new ArrayList<>();
////        ArrayList<String> wrongLetters = new ArrayList<>();
//
//        int pointsLost = 0;
//        boolean hasWon = false;
//
//        Scanner inputScanner = new Scanner(System.in);
//
//        while (!hasWon) {
//
//            String guessedLetter = inputScanner.nextLine();
//            System.out.println(guessedLetter);
//
//            boolean isFound = randomMovie.contains(guessedLetter);
//
//            String randomMovieGuess = randomMovieHidden;
//
//            if (isFound & !hasWon) {
//                if (randomMovie.contains(guessedLetter)) {
//                    System.out.println(randomMovie.replaceAll("[a-zA-Z]", "_"));
//                }
//                else {
//
//                }
//
////                guess exists in  randomMovie;
//
////                Character.isLetter(randomMovie.charAt(guess));
////                Character.isLetter(randomMovie.charAt(i));
////                randomMovieGuess = randomMovie.replaceAll("[a-zA-Z]","_");
//                System.out.println(randomMovieGuess);
////                System.out.println("You have " + i + " guess(es) left. Choose another one.");
//            }
//            else if (!isFound & !hasWon){
//                System.out.println("Didn't hit it this time! Choose another one.");
//                System.out.println(randomMovieGuess);
//            }
//            else {
//                hasWon = true;
//                break;
//            }
//
//        }
//
//        if (hasWon) {
//            System.out.println("CORRECT MOVIE. YOU WON!");
//        }
//        else {
//            System.out.println("Game over. YOU LOSE.");
//            System.out.println("The movie was: " + randomMovie);
//        }
//
//        // user guesses until win / loss
//        // expections
//
//
//    }
//}
