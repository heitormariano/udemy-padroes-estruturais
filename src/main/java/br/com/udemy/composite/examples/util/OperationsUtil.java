package br.com.udemy.composite.examples.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsUtil {

	public double roundValue(double value) {
		BigDecimal valueRounded = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
		return valueRounded.doubleValue();
	}
}
