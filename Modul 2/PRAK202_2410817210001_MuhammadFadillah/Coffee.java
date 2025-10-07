package PRAK202_2410817210001_MuhammadFadillah;

public class Coffee {
    private String coffeeName;
    private String size;
    private double price;
    private String customerName;

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTax() {
        return this.price * 0.11;
    }

    public void displayInfo() {
        System.out.println("Nama Kopi: " + getCoffeeName());
        System.out.println("Ukuran: " + getSize());
        System.out.println("Harga: Rp. " + getPrice());
    }
}
