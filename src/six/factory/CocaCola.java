package six.factory;
//public,paketno-privatno
class CocaCola extends Beverage {
    public CocaCola() {
        super("Coca cola");
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
