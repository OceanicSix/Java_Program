package test;

public class Booking {
    private String destination;
    private int numPassengers;
    private double costPassenger;

    public Booking(String destination, int numPassengers, double costPassenger) {
        this.destination = destination;
        this.numPassengers = numPassengers;
        this.costPassenger = costPassenger;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public double getCostPassenger() {
        return costPassenger;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "destination='" + destination + '\'' +
                ", numPassengers=" + numPassengers +
                ", costPassenger=" + costPassenger +
                '}';
    }
}