package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UsingFractions {

	public static void main(String args[]) {
		Fraction xx, yy, zz, jj;
		double c;

		boolean doUsingFractions = false;

		if (doUsingFractions) {
			xx = new Fraction(1, 4);
			yy = new Fraction(1, 6);

			zz = xx.add(yy);

			System.out.println("Problem: " + xx.toString() + " + "
					+ yy.toString() + " = " + zz.toString());

			System.out.println("Convert: " + zz.toString() + " = "
					+ zz.evaluate());

			jj = yy.reduce(zz);

			System.out.println("jj: " + jj.toString());
		} else {
			Process process = null;
			
			try {
				process = new ProcessBuilder("ls", "-Al", "..").start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;

			System.out
					.printf("Output of running %s is:", Arrays.toString(args));

			try {
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
