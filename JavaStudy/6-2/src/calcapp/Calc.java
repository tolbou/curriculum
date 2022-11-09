package calcapp;
import Logics.*;

public class Calc {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogics.tasu(a,b);
		int delta = Logics.CalcLogics.hiku(a,b);
		System.out.println("足すと" + total + ",引くと" + delta);

	}

}
