package WithStrategyPattern.Strategy;

public class SprotsDriveStrategy implements DrivesStrategy {

    @Override
    public void drive() {
        System.out.println("Sport Drive Strategy");
    }
}
