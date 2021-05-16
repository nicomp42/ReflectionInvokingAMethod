// Bill Nicholson
// nicholdw@ucmail.uc.edu

package main;

import java.lang.reflect.Method;

import device.Conveyor;

public class Main {
	
	public static void main(String args[]) {
		
		Conveyor myConveyor = new Conveyor("C1");

		@SuppressWarnings("unchecked")
		Class<Conveyor> conveyorClass = (Class<Conveyor>) myConveyor.getClass();

		for (Method m : conveyorClass.getMethods()) {
			System.out.println(m.getName());
			if (m.getName().equals("Start")) {
				try {
					m.invoke(myConveyor);
				} catch (Exception ex) {
					System.err.println(ex.getLocalizedMessage());
				}
			}			
		}
	}
}
