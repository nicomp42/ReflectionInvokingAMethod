// Bill Nicholson
// nicholdw@ucmail.uc.edu
// Programming To The Interface
package device;


public class Pump {
	private String ID;
	
	public Pump(String ID) {this.ID = ID;}
	
	public void Start() {
		System.out.println("I am a pump with ID " + ID + " and I am starting");	
	}

	public void Stop() {
		System.out.println("I am a pump with ID " + ID + " and I am stopping");	
	}

}
