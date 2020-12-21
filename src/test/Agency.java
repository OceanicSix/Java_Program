package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Agency {
    private String agencyName;
    private String agencyAddress;
    private String[] destination;
    private ArrayList<Booking> reservations;

    public String getAgencyName() {
        return agencyName;
    }

    public String getAgencyAddress() {
        return agencyAddress;
    }

    public String[] getDestination() {
        return destination;
    }

    public ArrayList<Booking> getReservations() {
        return reservations;
    }

    public boolean setAgencyName(String newAgencyName) {
        boolean result;
        if (newAgencyName.length() >= 5) {
            agencyName = newAgencyName;
            result = true;
        }
        else
            result = false;
        return result;
    }

    public boolean setAgencyAddress(String newAgencyAddress) {
        boolean result;
        if (newAgencyAddress.length() >= 9) {
            agencyAddress = newAgencyAddress;
            result = true;
        }
        else
            result = false;
        return result;
    }

    public boolean setDestination(String[] newDestination) {
        boolean result;
        if (newDestination.length > 0) {
            destination = newDestination;
            result = true;
        }
        else
            result = false;
        return result;
    }

    public boolean setReservations(ArrayList<Booking> newReservation) {
        reservations = newReservation;
        return true;
    }

    public Agency(String agencyName, String agencyAddress, String[] destination) {
        setAgencyName(agencyName);
        setAgencyAddress(agencyAddress);
        setDestination(destination);

        reservations = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Agency{" +
                "agencyName='" + agencyName + '\'' +
                ", agencyAddress='" + agencyAddress + '\'' +
                ", destination=" + (destination == null ? null : Arrays.asList(destination)) +
                ", reservations=" + reservations +
                '}';
    }

     public boolean isBookingValid(String record){
        boolean result=false;
        String [] recordAr= record.split("\\;");
        if(recordAr.length==3)
            if(Tools.arrayContain(destination,recordAr[0]))
                if(Tools.isNumeric(recordAr[1])&&Tools.isNumeric(recordAr[2]))
                    result = true;

        return result;
    }

    public boolean addReservation(Booking newResv){
        getReservations().add(newResv);
        return true;
    }

    public double getTotalIncome(Booking newResv){
        return newResv.getCostPassenger()*newResv.getNumPassengers();
    }

    public static void main(String[] args) {
        String [] dest = {"melbourne","sydney","Perth"};
        Agency ag1 = new Agency("FIT9191","melbourne",dest);
        Booking b1= new Booking("melbourne",1,100);
        Booking b2= new Booking("Perth",2,100);
        ArrayList<Booking> bookAr = new ArrayList<>();
        bookAr.add(b1);
        bookAr.add(b2);
        ag1.setReservations(bookAr);
        System.out.println(ag1);
        Booking b3= new Booking("Perth",2,200);
        ag1.addReservation(b3);
        System.out.println(ag1);
        System.out.println(ag1.getTotalIncome(b2));
    }


}