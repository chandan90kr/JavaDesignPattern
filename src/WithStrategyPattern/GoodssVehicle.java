package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodssVehicle extends Vehicle {
    public GoodssVehicle() {
        super(new NormalDriveStrategy());
    }
}
