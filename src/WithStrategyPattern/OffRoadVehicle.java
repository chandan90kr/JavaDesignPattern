package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivesStrategy;
import WithStrategyPattern.Strategy.SprotsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SprotsDriveStrategy());
    }

}
