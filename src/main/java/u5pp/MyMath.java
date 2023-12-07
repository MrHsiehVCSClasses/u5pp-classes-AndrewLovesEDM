package u5pp;

import java.util.Scanner;



public class MyMath {
	public static int abs(int x) {
        int absValue = MyMath.abs(x);
        return absValue;
	}
	static double abs(double x) {
		double absValuey = MyMath.abs(x);
		return absValuey;
	}
	static double pow(double base, int exponent) {
		
//		for (int x = 0, x < 0, x++) {
//			double result = pow(base, exponent);
//		}
		double result = pow(base, exponent);
		return result;
	}

	public static int perfectSqrt(int x) {
		if (x < 0) {
			return -1;
		}
		int sqrt = (int) Math.sqrt(x);
		return sqrt;
	}
	
}