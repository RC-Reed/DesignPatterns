import java.util.ArrayList;

public class QuickSort implements SortBehavior {
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        quickSort(appartments, 0, appartments.size() - 1);
        return appartments;
    }

    private void quickSort(ArrayList<Appartment> appartments, int low, int high) {
        if (low < high) {
            int pi = partition(appartments, low, high);

            quickSort(appartments, low, pi-1);
            quickSort(appartments, pi+1, high);
        }
    }

    private int partition(ArrayList<Appartment> appartments, int low, int high) {
        Appartment pivot = appartments.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (appartments.get(j).compareTo(pivot) < 0) {
                i++;

                Appartment temp = appartments.get(i);
                appartments.set(i, appartments.get(j));
                appartments.set(j, temp);
            }
        }

        Appartment temp = appartments.get(i + 1);
        appartments.set(i + 1, appartments.get(high));
        appartments.set(high, temp);

        return i + 1;
    }
}
