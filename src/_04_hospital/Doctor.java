package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	private boolean canPerformSurgery = false;
	private boolean canMakeHousecalls = false;
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	boolean performsSurgery(){
		return canPerformSurgery;
	}
	
	boolean makesHouseCalls() {
		return canMakeHousecalls;
	}
	
	void assignPatient(Patient person) throws DoctorFullException{
		if(patients.size()<3) {
			patients.add(person);
		}
		else {
			throw new DoctorFullException("Too many patients!");
		}
	}
	
	ArrayList<Patient> getPatients() {
		return patients;
	}

	public void doMedicine() {
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
}
