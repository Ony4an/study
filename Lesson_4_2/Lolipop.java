package Lesson_4_2;

public class Lolipop extends Sweets {
    private String placeOfProduction;


    public Lolipop () {}

    public Lolipop (String name, int weight, int price, int number, String placeOfProduction) {
    super(name,weight,price,number);
    this.placeOfProduction = placeOfProduction;
    }

    public String getPlaceOfProduction() {
        return placeOfProduction;
    }

    public void setPlaceOfProduction(String placeOfProduction) {
        this.placeOfProduction = placeOfProduction;
    }

    @Override
    public String toString() {
        return "Lolipop{" + super.toString() +
                "placeOfProduction='" +  placeOfProduction + '\'' +
                '}';
    }
}
