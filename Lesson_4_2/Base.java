package Lesson_4_2;



public class Base {
    public static void main(String[] args) {
        Lolipop lolipop1 = new Lolipop("ChupaChups", 2, 10, 3, "China");
        Donut donut1 = new Donut("HomersDream", 3, 20, 6, 3);
        Bubblegum bubblegum1 = new Bubblegum("Turbo", 1, 1, 20, "Melon");
        Lolipop lolipop2 = new Lolipop();
        lolipop2.setName("Ball");
        lolipop2.setWeight(4);
        lolipop2.setPrice(13);
        lolipop2.setNumber(6);
        lolipop2.setPlaceOfProduction("Japan");
        Sweets [] box = {lolipop1, donut1, bubblegum1, lolipop2};
        int sumPrice = lolipop1.getPrice() + donut1.getPrice() + bubblegum1.getPrice() + lolipop2.getPrice();
        System.out.println("Общая цена подарка: " + sumPrice);
        int sumWeight = lolipop1.getWeight() + donut1.getWeight() + bubblegum1.getWeight() + lolipop2.getWeight();
        System.out.println("Общий вес подарка: " + sumWeight);
        for (Sweets someSweets : box){
            System.out.println(someSweets.toString());
        }
    }
}
