package u5pp;
//
//import java.util.Scanner;
//
//
//
//public class MyMath {
//	public static int abs(int x) {
//        int absValue = MyMath.abs(x);
//        return absValue;
//	}
//	static double abs(double x) {
//		double absValuey = MyMath.abs(x);
//		return absValuey;
//	}
//	static double pow(double base, int exponent) {
//		
////		for (int x = 0, x < 0, x++) {
////			double result = pow(base, exponent);
////		}
//		double result = pow(base, exponent);
//		return result;
//	}
//
//	public static int perfectSqrt(int x) {
//		if (x < 0) {
//			return -1;
//		}
//		int sqrt = (int) Math.sqrt(x);
//		return sqrt;
//	}
//	
//}

public class MyMath {
	public static int abs(int x) {
		if (x < 0) {
    		return -x;
    	}
    	else {
    		return x;
    	} 
		// returns the absolute value of int
	}
	public static double abs(double x) {
		if (x < 0) {
			return -x;
		}
		else {
			return x;
		}
	}
	public static double pow(double base, int exponent) {
		// if exponent is 0 the number says the same thing
		if (exponent == 0) {
			return 1;
		}
		else {
			// for every number the exponent goes up, the base is put to that power.
			double urmom = 1;
			for (int a = 0; a < exponent; a++) {
				urmom = urmom * base;
			}
			return urmom;
		}
	}
	public static int perfectSqrt(int x) {
		// pretty much just reverses the base to exponent by 
		//taking the square root of the number as a int
		if (x < 0) {
			return -1;
		}
		int sqrt = (int) Math.sqrt(x);
		if (sqrt * sqrt == x) {
			return sqrt;
		}
		else {
			return -1;
		}
	}
		
}


