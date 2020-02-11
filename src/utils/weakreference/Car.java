package utils.weakreference;

public class Car {
    private double price;
    private String colour;

    public Car(double price, String colour){
        this.price = price;
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Car： " + price + " finalize。");
    }
    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
