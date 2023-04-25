package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.Strategy.SportsDriveStrategy;

public class SUVVehicle extends Vehicle{
    SUVVehicle() {
        super(new SportsDriveStrategy());
    }
}
