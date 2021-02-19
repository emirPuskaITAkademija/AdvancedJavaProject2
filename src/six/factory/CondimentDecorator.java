package six.factory;

public abstract class CondimentDecorator  extends Beverage{

    private Beverage beverage;


    public CondimentDecorator(String name, Beverage beverage) {
        super(name);
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
