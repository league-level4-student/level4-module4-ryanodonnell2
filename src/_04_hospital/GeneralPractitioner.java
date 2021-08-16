package _04_hospital;

public class GeneralPractitioner extends Doctor{
	private boolean canPerformSurgery = false;
	private boolean canMakeHousecalls = true;
	
	boolean performsSurgery(){
		return canPerformSurgery;
	}
	
	boolean makesHouseCalls() {
		return canMakeHousecalls;
	}
}
