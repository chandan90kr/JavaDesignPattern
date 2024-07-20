package DecoratorPattern;


import DecoratorPattern.PizzaWithDecorator.ExtraCheese;
import DecoratorPattern.PizzaWithDecorator.MushRoom;
import DecoratorPattern.PizzaWithoutDecorator.BasePizza;
import DecoratorPattern.PizzaWithoutDecorator.Margharita;

public class Pizza {
    public static void main(String[] args) {

        //Without DecoratorPattern Only is a relationship
//        int basePizza = new Margharita().cost() ;
//        System.out.println( "Pizza Cost  :" +basePizza);

        //Without DecoratorPattern Only is a relationship
        BasePizza basePizza = new MushRoom(new ExtraCheese(new Margharita())) ;
        System.out.println( "Pizza Cost  :" +basePizza.cost());

    }
}