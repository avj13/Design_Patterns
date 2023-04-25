package StrategyPattern;

import StrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
	
	public NormalVehicle() {
		// TODO Auto-generated constructor stub

		//Constructor Injection
		super(new NormalDriveStrategy());
	} 

}
