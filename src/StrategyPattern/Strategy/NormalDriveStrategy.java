package StrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.print("Normal Drive Strategy");
	}

}
