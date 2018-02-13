package Lesson_4_2;

public class Sweets {
    private String name;
    private int weight;
    private int price;
    private int number;

    public Sweets() {}

    public Sweets (String name, int weight, int price, int number){
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.number = number;
     }

    public String getName() {
        return name;
    }


    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", number=" + number +
                ',';
    }
}
