import java.util.ArrayList;

public class Lab13_Problem2
{
    public static void main(String[] args)
    {
        ArrayList<String> listFruits = new ArrayList<>(); //Declare list

        listFruits.add("Apple"); //Add initial values
        listFruits.add("Banana");
        listFruits.add("Cherry");
        listFruits.add("Date");

        listFruits.add(0, "Elderberry"); //Insert values
        listFruits.add(3, "Fig");

        System.out.println("First item: " + listFruits.get(0)); 
        System.out.println("Last item: " + listFruits.get(listFruits.size() - 1)); 

        listFruits.set(2, "Grape"); //Replaces value

        System.out.println("Final count of items: " + listFruits.size()); 
    }
}