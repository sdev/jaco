package sdev.main;

import sdev.pattern.*;
import sdev.tools.*;

public class Main {
	public static void main(String[] args) {
		Singleton i1 = Singleton.getInstance();
		Singleton i2 = Singleton.getInstance();
		if (i1 == i2) {
			System.out.println("I am a duplicate");
		}
		
		PrintObjectClassInfo.printClassName(i1);
		PrintObjectClassInfo.printClassName(i2);
		PrintObjectClassInfo.printSimpleClassName(i1);
		PrintObjectClassInfo.printClassCanonicalName(i1);
		
		VowelCounter vc = new VowelCounter(1);
		vc.getSource();
		System.out.println("# of Voewls: " + vc.getStat());

	}

}
