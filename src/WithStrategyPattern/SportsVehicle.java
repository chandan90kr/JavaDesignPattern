package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivesStrategy;
import WithStrategyPattern.Strategy.SprotsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SprotsDriveStrategy());
    }

}
