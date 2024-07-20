package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivesStrategy;

public class Vehicle {

    DrivesStrategy drivesStrategy;

    public Vehicle(DrivesStrategy drivesStrategy) {
        this.drivesStrategy = drivesStrategy;
    }

    public void drive(){
        drivesStrategy.drive();
    }
}
