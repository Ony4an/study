package Lesson_4_2;

public class Bubblegum extends Sweets {
    private String flavor;

    public Bubblegum (String name, int weight, int price, int number, String flavor) {
        super (name, weight, price, number);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Bubblegum{" + super.toString() +
                "flavor='" + flavor + '\'' +
                '}';
    }
}
