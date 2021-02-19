package six.factory;

public class BeverageFactory {

    public static Beverage getBeverage(String name){
        if(name.equals("Čaj")){
            return new Tea();
        }else if(name.equals("Espresso")){
            return new Espresso();
        }else if(name.equals("CocaCola")){
            return new CocaCola();
        }else if(name.equals("BosnianCaffe")){
            return new BosnianCaffe();
        }
        return null;
    }
}
