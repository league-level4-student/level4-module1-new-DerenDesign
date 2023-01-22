package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class GeneralPractitioner extends Doctor {
	GeneralPractitioner() {
		listP = new ArrayList<Patient>();
	}
	@Override
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return listP;
	}

	@Override
	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if(listP.size()<3) {
			listP.add(patient);
		}
		else {
			throw new DoctorFullException();
		}
		
	}

	@Override
	public Patient getPatient(int index) {
		// TODO Auto-generated method stub
		return listP.get(index);
	}
	@Override
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < listP.size(); i++) {
			listP.get(i).checkPulse();
		}
		
	}
	@Override
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

}
