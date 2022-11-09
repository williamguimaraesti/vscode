package util;

public class Util {
	public static double calculaPotencia(double base, int expoente) {
		if( expoente < 0 ) {
			expoente *= -1;
			base = 1 / base;
		}
		double calcPot = 1;
		while( expoente != 0 ) {
			calcPot *= base;
			expoente--;
		}
		return calcPot;
	}
}
