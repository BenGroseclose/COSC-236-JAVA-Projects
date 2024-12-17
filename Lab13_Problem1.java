import java.util.ArrayList;
import java.util.Collections;

public class Lab13_Problem1
{
    public static void main(String[] args)
    {
        ArrayList<String> listStates = new ArrayList<>();

        listStates.add("VT");
        listStates.add("TX");
        listStates.add("LA");
        listStates.add("AR");
        listStates.add("CA");

        System.out.println("After adding initial states:");
        fvDisplay(listStates);

        listStates.add(0, "UT");

        System.out.println("\nAfter inserting UT at index 0:");
        fvDisplay(listStates);

        Collections.sort(listStates);

        System.out.println("\nAfter sorting in ascending order:");
        fvDisplay(listStates);

        Collections.sort(listStates, Collections.reverseOrder());

        System.out.println("\nAfter sorting in descending order:");
        fvDisplay(listStates);

        listStates.remove("CA");
        Collections.sort(listStates);

        System.out.println("\nAfter removing CA and sorting in ascending order:");
        fvDisplay(listStates);

        listStates.add("GA");
        listStates.add("GA");

        System.out.println("\nAfter adding GA twice:");
        fvDisplay(listStates);

        listStates.remove("GA");

        System.out.println("\nAfter removing GA:");
        fvDisplay(listStates);

        System.out.println("\nBehavior: remove(\"GA\") only removes the first occurrence of 'GA'.");

        listStates.clear();

        System.out.println("\nAfter clearing the list:");
        fvDisplay(listStates);
        System.out.println("Behavior: The list is now empty.");
    }

    public static void fvDisplay(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}