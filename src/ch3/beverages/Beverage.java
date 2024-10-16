package ch3.beverages;

public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    abstract public double cost();
}
