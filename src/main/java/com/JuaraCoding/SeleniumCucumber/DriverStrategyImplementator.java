package com.JuaraCoding.SeleniumCucumber;

import com.JuaraCoding.SeleniumCucumber.utils.Constants;

public class DriverStrategyImplementator {
	public static DriverStrategy chooseStrategy(String strategy) {

		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
		case Constants.FIREFOX:
			return (DriverStrategy) new Firefox();
		default:
			return null;
		}
	}
}
