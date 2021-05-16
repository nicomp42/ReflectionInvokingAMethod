// Bill Nicholson
// nicholdw@ucmail.uc.edu

package device;

public class Conveyor {
	private String ID;
	
	public Conveyor(String ID) {this.ID = ID;}
	
	public void Start() {
		System.out.println("I am a conveyor with ID " + ID + " and I am starting");	
		
	}

	public void Stop() {
		System.out.println("I am a conveyor with ID " + ID + " and I am stopping");	
		
	}

}
