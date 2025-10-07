package PRAK201_2410817210001_MuhammadFadillah;

public class Fruit {
    private String fruitName;
    private double weight;
    private double price;
    private double quantity;

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double calculatePriceBeforeDiscount() {
        return this.price * this.quantity / this.weight;
    }

    public double calculateTotalDiscount() {
        double discountMultiplier = (int) (this.quantity / 4);
        return discountMultiplier * (4 * this.price * 0.02);
    }

    public double calculatePriceAfterDiscount() {
        return calculatePriceBeforeDiscount() - calculateTotalDiscount();
    }

    public void displayInfo() {
        System.out.println("Nama Buah: " + getFruitName());
        System.out.println("Berat: " + getWeight());
        System.out.println("Harga: " + getPrice());
        System.out.println("Jumlah Beli: " + getQuantity() + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", calculatePriceBeforeDiscount());
        System.out.printf("Total Diskon: Rp%.2f\n", calculateTotalDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", calculatePriceAfterDiscount());
    }
}