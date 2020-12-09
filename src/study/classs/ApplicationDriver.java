package study.classs;

public class ApplicationDriver {
    public static void main(String[] args) {
        Person tania = new Person();

//        System.out.println("Hello World");
//        tania.setAge(21);
//        System.out.println("Tania is " + tania.getAge() + " years old.");
        tania.setFavouriteColour("red");
        System.out.println(tania.getFavouriteColour());
        tania.setPersonAddress("fail");
        System.out.println(tania.getPersonAddress());
    }
}


