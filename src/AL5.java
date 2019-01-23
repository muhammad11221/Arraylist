import java.util.ArrayList;
import java.util.Scanner;

public class AL5 {

    public static void main(String []args) {

        Scanner userinput = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>(); // brown, jsj,

        String userColor="";
       while (!userColor.equalsIgnoreCase("Q")) {

            System.out.println("enter color : ");
            userColor = userinput.nextLine();

if (userColor.equalsIgnoreCase("Q")){

    break;
}
            //Add colors to the array list
            colors.add(userColor);

        }// end while loop

        for (String color : colors) {

            System.out.println(color);
        }
    }
}