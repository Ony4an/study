package Lesson_4_2;

public class Donut extends Sweets {
    private int radius;

    public Donut (String name, int weight, int price, int number, int radius) {
        super(name, weight, price, number);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Donut{" + super.toString() +
                "radius=" + radius +
                '}';
    }
}
