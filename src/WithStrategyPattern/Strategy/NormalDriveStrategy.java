package WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DrivesStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
