package six;

import six.factory.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class Executor {
    public static void main(String[] args)throws Exception{


       /* Beverage espresso = BeverageFactory.getBeverage("Espreso");
        degustirajBeverage(espresso);
        Beverage čaj = BeverageFactory.getBeverage("Čaj");
        degustirajBeverage(čaj);*/

        Beverage espresso1 = BeverageEnumFactory.ESPRESSO_FACTORY.getBeverage();
       /* Beverage aidinoPice = new MilkDecorator(espresso);
        degustirajBeverage(aidinoPice);
        Tea čaj = new Tea();
        Beverage amilinoPice = new MilkDecorator(čaj);
        degustirajBeverage(amilinoPice);
        CocaCola cocaCola = new CocaCola();
        degustirajBeverage(cocaCola);
        Beverage amerovoPice = new MilkDecorator(cocaCola);
        degustirajBeverage(amerovoPice);*/
    }

    static void degustirajBeverage(Beverage espresso){
        System.out.println("Pijem: " + espresso.getName()+" i to nas košta : " + espresso.cost());
    }
}
