import java.util.ArrayList;

public class BubbleSort implements SortBehavior {
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        // Implement bubble sort on appartments based on price
        int n = appartments.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (appartments.get(j).compareTo(appartments.get(j+1)) > 0) {
                    Appartment temp = appartments.get(j);
                    appartments.set(j, appartments.get(j+1));
                    appartments.set(j+1, temp);
                }
            }
        }
        return appartments;
    }
}
