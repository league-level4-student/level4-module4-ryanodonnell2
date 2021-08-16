package _04_hospital;

import java.util.ArrayList;

public class Hospital{
	private ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	private ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	void addDoctor(Doctor doc) {
		doctorList.add(doc);
	}
	
	ArrayList<Doctor> getDoctors() {
		return doctorList;
	}
	
	void addPatient(Patient person) {
		patientList.add(person);
	}
	
	ArrayList<Patient> getPatients() {
		return patientList;
	}

	public void assignPatientsToDoctors() {
		int patientsLeft = patientList.size();
		for (int i = 0; i < doctorList.size(); i++) {
			for (int j = 0; j < 3; j++) {
				if(patientsLeft>0) {
					try {
						doctorList.get(i).assignPatient(patientList.get(i*3+j));
						patientsLeft--;
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
