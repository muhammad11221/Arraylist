import java.util.ArrayList;
import java.util.Collections;
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

            System.out.println(moviee); // alphabetically
        }
    }
}