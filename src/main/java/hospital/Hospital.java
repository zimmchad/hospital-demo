package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hospital {

    HashMap<String, HospitalEmployee> employeeList = new HashMap<>();
    HashMap<Integer, Patient> patientList = new HashMap<>();
    private int patientID;


    public void hire(HospitalEmployee employeeToHire) {
        employeeList.put(employeeToHire.getEmployeeNumber(), employeeToHire);

    }

    public HospitalEmployee findEmployee(String employeeNumber) {
        return employeeList.get(employeeNumber);
    }

    public Collection<HospitalEmployee> getAllEmployees() {
        return employeeList.values();
    }

    public Collection<HospitalEmployee> getMedicalEmployees() {
        Collection<HospitalEmployee> medicalEmployees = new ArrayList<>();
        for(HospitalEmployee employee: employeeList.values()){
            if(employee instanceof MedicalDuties){
                medicalEmployees.add(employee)
            }
        }
        return medicalEmployees;
    }

    public void admit(Patient patientToAdmit) {
        patientID++;
        patientList.put(patientID, patientToAdmit);

    }

    public Collection<Patient> getAllPatients() {
        return patientList.values();
    }
}
