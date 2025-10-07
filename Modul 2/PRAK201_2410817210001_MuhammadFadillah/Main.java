package PRAK201_2410817210001_MuhammadFadillah;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.setFruitName("Apel");
        apple.setWeight(0.4);
        apple.setPrice(7000);
        apple.setQuantity(40.0);
        apple.displayInfo();
        Fruit mango = new Fruit();
        mango.setFruitName("mangga");
        mango.setWeight(0.2);
        mango.setPrice(3500);
        mango.setQuantity(15.0);
        mango.displayInfo();

        Fruit avocado = new Fruit();
        avocado.setFruitName("alpukat");
        avocado.setWeight(0.25);
        avocado.setPrice(10000);
        avocado.setQuantity(12.0);
        avocado.displayInfo();
    }
}
