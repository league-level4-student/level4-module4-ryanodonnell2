package _04_hospital;

public class Patient extends Hospital{
	private boolean feelsCaredFor = false;
	private boolean pulseChecked = false;
	
	void checkPulse() {
		pulseChecked = true;
		feelsCaredFor = true;
	}
	
	boolean feelsCaredFor() {
		return feelsCaredFor;
	}
}
