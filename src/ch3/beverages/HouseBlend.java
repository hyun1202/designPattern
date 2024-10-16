package ch3.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드";
    }

    public HouseBlend(Size size) {
        description = "하우스 블렌드";
        setSize(size);
    }

    @Override
    public double cost() {
        return switch (getSize()) {
            case TALL -> .89;
            case GRANDE -> .89 + .3;
            case VENTI -> .89 + .6;
        };
    }
}
