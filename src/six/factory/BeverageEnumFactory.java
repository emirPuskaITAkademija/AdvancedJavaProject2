package six.factory;

public enum BeverageEnumFactory {
    ESPRESSO_FACTORY(new Espresso()),
    TEA_FACTORY(new Tea()),
    COCA_COLA_FACTORY(new CocaCola()),
    ESPRESSO_MLIJEKO_FACTORY(new MilkDecorator(new Espresso())),
    TEA_MLIJEKO_FACTORY(new MilkDecorator(new Tea()));


    private Beverage beverage;

    private BeverageEnumFactory(Beverage beverage){
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
