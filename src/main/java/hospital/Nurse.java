package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties{


    private String numPatients;
    public Nurse(String employeeNumber, String name, int numPatients) {
        super(employeeNumber, name);

        this.numPatients = numPatients;

    }
    @Override
    public void careForPatient(hospital.Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    @Override
    public void drawBlood(hospital.Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    public int calculatePay() {
        return 80000;
    }
}
