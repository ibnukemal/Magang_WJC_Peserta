package com.peserta.wjc.driver.strategies;

import com.peserta.wjc.utils.Constants;

public class DriverStrategyImplementator {

	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
			
		case Constants.FIREFOX:
			return new Firefox();

		default:
			return null;
		}
	}
}
	
	
