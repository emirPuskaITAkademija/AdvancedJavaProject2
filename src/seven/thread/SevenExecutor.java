package seven.thread;

import six.factory.Beverage;
import six.factory.BeverageEnumFactory;

public class SevenExecutor {
    public static void main(String[] args) {
        Beverage beverage = BeverageEnumFactory.COCA_COLA_FACTORY.getBeverage();
        System.out.println(beverage.getName()+" : " + beverage.cost());
    }
}
