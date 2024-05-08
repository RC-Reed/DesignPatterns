/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 import java.util.ArrayList;

public class AppartmentList {
    private ArrayList<Appartment> appartments = new ArrayList<>();
    private SortBehavior sortBehavior;

    // Initialize with a default sort behavior (e.g., BubbleSort)
    public AppartmentList() {
        this.sortBehavior = new BubbleSort();
    }

    public void add(String address, int numBedrooms, int numBathrooms, double price) {
        appartments.add(new Appartment(address, numBedrooms, numBathrooms, price));
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public ArrayList<Appartment> getSortedList() {
        if (this.sortBehavior == null) {
            throw new IllegalStateException("Sort behavior must be set before sorting.");
        }
        return sortBehavior.sort(appartments);
    }

    public ArrayList<Appartment> getUnSortedList() {
        return new ArrayList<>(appartments);
    }
}
