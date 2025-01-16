package January;
// Introduction to ArrayList.
import java.util.ArrayList;

import java.util.Collections;
public class p17jan{
    public static void main(String[] args) {
        Integer i = Integer.valueOf(6); //Wrapper Class to maintain OOP nature.
        System.out.println(i);
        //creating the object
        ArrayList<Integer> ar = new ArrayList<>();
        //adding the elements
        ar.add(1);
        ar.add(3);
        ar.add(2, 6);
        System.out.println(ar.get(1));
        //Print the arraylist 
        for (int j = 0; j < ar.size(); j++) {
            System.out.print(ar.get(j)+" ");
        }
        //or
        System.out.print(ar);
        //removing
        ar.remove(2);
        //reverse an Arraylist
        Collections.reverse(ar);
        System.out.println(ar);
    }
}