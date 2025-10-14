package Soal2;

public class Cat extends Pet{
    private String furColor;

    public Cat(String breed, String name, String furColor) {
        super(breed, name);
        this.furColor = furColor;
    }

    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + furColor);
    }
}
