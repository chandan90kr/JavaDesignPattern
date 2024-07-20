import WithStrategyPattern.GoodssVehicle;
import WithStrategyPattern.OffRoadVehicle;
import WithStrategyPattern.SportsVehicle;
import WithStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}