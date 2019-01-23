import java.util.ArrayList;
import java.util.Scanner;

public class AL4 {

    public static void main(String []args){

        Scanner addingcolor = new Scanner (System.in);
        System.out.println("enter color : ");
        String usercolor = addingcolor.nextLine();
        ArrayList <String> colors = new ArrayList<>();

        //Add colors to the array list

        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add(usercolor);

        for (String color: colors) {

            System.out.println(color);
        }

    }
}