package StrategyPattern;

import StrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
	
	public NormalVehicle() {
		//Constructor Injection
		super(new NormalDriveStrategy());
	}
}
