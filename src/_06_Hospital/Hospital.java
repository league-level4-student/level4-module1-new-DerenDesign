package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	List<Doctor> listD = new ArrayList<Doctor>();
	List<Patient> listP = new ArrayList<Patient>();
	
	public List<Doctor> getDoctors(){
		return listD;
	}
	public List<Patient> getPatients(){
		return listP;
	}
	public void addPatient(Patient patient) {
		listP.add(patient);
	}
	public void addDoctor(Doctor doctor) {
		listD.add(doctor);
	}
	public void assignPatientsToDoctors() {
		int ind = 0;
		boolean loop = false;
		for(int i =0; i < listD.size(); i++) {
			if(loop == true) {
				i--;
				loop = false;
			}
			try {
				listD.get(i).assignPatient(listP.get(ind));
			}
			catch(DoctorFullException dfe) {
				loop = false;
				
			}
			ind++;
			loop = true;
		}
	}
	
}
