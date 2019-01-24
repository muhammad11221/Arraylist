import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Movies {

    public static void main(String []args) {

        Scanner userinput = new Scanner(System.in);
        ArrayList<String> movie = new ArrayList<>(); // brown, jsj,

        String movies="";
        while (!movies.equalsIgnoreCase("Q")) {

            System.out.println("enter movie name: ");
            movies = userinput.nextLine();

            if (movies.equalsIgnoreCase("Q")){

                break;
            }
            //Add colors to the array list
            movie.add(movies);

        }// end while loop
        Collections.sort(movie);
        for (String moviee : movie) {

            System.out.println(moviee);
        }
        Random rnd = new Random(movie.size());
        int x = rnd.nextInt(movie.size());
        System.out.println("\nHere is a movie suggestion for tonight!");
        System.out.println(movie.get(x));


        // Exit
      userinput.close();
        System.exit(0);
    }
}