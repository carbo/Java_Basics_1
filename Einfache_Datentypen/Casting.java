package Einfache_Datentypen;
public class Casting {
	public static void main(String arg[]) {
		// lokale Variablen
		final int b;
		b = 5;
		double myDouble1 = 2147483642d;
		double myDouble2 = 2147483647;
		double myDouble3 = 2147483648d;
		int a = 32769;
		int myInt1, myInt2, myInt3;
		short myShort;
		short x = 5, y = 12;

		 /* explizite Typumwandlung von dem Datentyp double in den Datentyp int */
		 myInt1= (int) myDouble1;
		 myInt2= (int) myDouble2;
		 myInt3= (int) myDouble3;
		 myShort= (short) a;
		 short z = (short)(x + y);


		  // Ausgabe der expliziten Typumwandlung von oben
		  System.out.println("Double " + myDouble1 + " wird zu " + myInt1);
		  System.out.println("Double" + myDouble2 + " wird zu " + myInt2);
		  System.out.println("Double " + myDouble3 + " wird zu " + myInt3);
		  System.out.println("Integer " + a + " wird zu " + myShort);
		  System.out.println(z);
	}
}
