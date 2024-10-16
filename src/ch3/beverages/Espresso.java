package ch3.beverages;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    public Espresso(Size size) {
        description = "에스프레소";
        setSize(size);
    }

    @Override
    public double cost() {
        return switch (getSize()) {
            case TALL -> 1.99;
            case GRANDE -> 1.99 + .3;
            case VENTI -> 1.99 + .6;
        };
    }
}
