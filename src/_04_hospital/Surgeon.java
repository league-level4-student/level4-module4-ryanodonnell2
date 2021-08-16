package _04_hospital;

public class Surgeon extends Doctor {
	private boolean canPerformSurgery = true;
	private boolean canMakeHousecalls = false;
	
	boolean performsSurgery(){
		return canPerformSurgery;
	}
	
	boolean makesHouseCalls() {
		return canMakeHousecalls;
	}
}
