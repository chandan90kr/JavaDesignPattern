package DecoratorPattern.PizzaWithDecorator;

import DecoratorPattern.PizzaWithoutDecorator.BasePizza;

public  class MushRoom extends ToppingDecorator {
    BasePizza basePizza;

    public MushRoom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
