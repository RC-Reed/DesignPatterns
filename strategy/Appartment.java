public class Appartment {
    private String address;
    private int numBedrooms;
    private int numBathrooms;
    private double price;

    public Appartment(String address, int numBedrooms, int numBathrooms, double price) {
        this.address = address;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.price = price;
    }

    public int compareTo(Appartment other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return String.format("$%.2f %s\n%d bedroom%s %d bathroom%s \n",
            this.price, this.address, this.numBedrooms, 
            (this.numBedrooms > 1 ? "s" : ""), 
            this.numBathrooms, (this.numBathrooms > 1 ? "s" : ""));
    }
}

