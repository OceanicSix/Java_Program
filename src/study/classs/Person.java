package study.classs;

public class Person {
    private int age;
    private String favouriteColour;
    private String PersonAddress = "default address";

    public void setAge(int newAge) {
        if (newAge > 0 && newAge <= 120)
            age = newAge;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }

    public void setFavouriteColour(String colour) {
        favouriteColour = colour;
    }

    public String getPersonAddress(){
        return PersonAddress;
    }

    public void setPersonAddress(String address){
        if(address.length() >= 5 && address.length() <= 25)
            PersonAddress = address;

    }

    public int getAge() {
        return age;
    }

}


