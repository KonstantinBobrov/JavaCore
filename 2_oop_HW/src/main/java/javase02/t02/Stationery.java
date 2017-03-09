package javase02.t02;

public abstract class Stationery {
    private double price;
    private String name;

    public Stationery(double price) {
        this.price = price;
        name = "Some stationery";
    }

    public Stationery(String name, double price) {
        this.price = price;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
