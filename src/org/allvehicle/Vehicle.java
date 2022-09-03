package org.allvehicle;

import org.fourwheeler.Fourwheeler;
import org.threewhe.Threewheeler;
import org.twowheeler.Twowheeler;

public class Vehicle {
	public void vehicleNecessary() {
		System.out.println("duke"); 
	}
	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		
		a.vehicleNecessary();
		
		Fourwheeler x =new Fourwheeler();
		x.bus();
		x.car();

		Threewheeler c = new Threewheeler();
		c.auto();

		Twowheeler b = new Twowheeler();
		b.bike();
		b.cycle();
			
	}

}
