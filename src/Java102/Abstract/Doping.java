package Java102.Abstract;

public abstract class Doping {

    protected double price;
    protected double[] taxes;

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public double[] getTaxes() {
        return this.taxes;
    }
    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }


    public abstract double calculate();
}
