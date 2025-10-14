package Soal2;

public class Dog extends Pet{
    private String furColor;
    private String[] abilities;

    public Dog(String breed, String name, String furColor, String[] abilities) {
        super(breed, name);
        this.furColor = furColor;
        this.abilities = abilities;
    }

    public void displayDogDetails() {
        super.display();
        System.out.println("Warna Bulu : " + furColor);
        System.out.print("Kemampuan : ");
        for (String ability : abilities) {
            System.out.print(ability + " ");
        }
        System.out.println();
    }
}