package Week1;

public class TaxiService {
    private double totalDistance;
    private double totalCost;

    public TaxiService(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double calculateDistance() {
        if (totalDistance <= 5) {
            totalCost = totalDistance * 10;
        } else if (totalDistance <= 20) {
            totalCost = (5 * 10) + ((totalDistance - 5) * 8);
        } else {
            totalCost = (5 * 10) + (15 * 8) + ((totalDistance - 20) * 5);
        }
        return totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
