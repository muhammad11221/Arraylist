import java.util.ArrayList;

public class AL2 {

    public static void main(String []args){

        ArrayList <String> colors = new ArrayList<>();

        //Add colors to the array list

        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");


        for(String s : colors){
            System.out.println(s);
        }

    }
}