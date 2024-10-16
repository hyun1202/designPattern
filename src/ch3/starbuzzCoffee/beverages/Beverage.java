package ch3.starbuzzCoffee.beverages;

/*
    요구사항 추가:
      - 1. 톨(소), 그란데(중), 벤티(대) 사이즈 도입
      - 2. 사이즈에 따라 첨가물 가격이 다름
 */
public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    // 기본값은 톨사이즈
    Size size = Size.TALL;
    String description;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    abstract public double cost();
}
