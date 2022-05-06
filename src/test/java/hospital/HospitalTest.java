package hospital;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.concurrent.Callable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    Hospital underTest = new Hospital();
    Doctor doctor = new Doctor("1", "doctor name", "specialty");
    Nurse nurse = new Nurse("1", "nurse name", "specialty");
    Janitor janitor = new Janitor("1", "Janitor name", "maternity wing", true);

    @Test
    public void shouldBeAbleToHireADoctor(){
        underTest.hire(doctor);
        HospitalEmployee foundDoctor = underTest.findEmployee();
        assertEquals("doctor name", foundDoctor.getName());
    }

    @Test
    public void shouldBeAbleToHireADoctorNurseAndJanitor(){
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        HospitalEmployee foundDoctor = underTest.findEmployee("1");
        HospitalEmployee foundNurse = underTest.findEmployee("2");
        HospitalEmployee foundJanitor = underTest.findEmployee("3");
        assertEquals("doctor name", foundDoctor.getName());
        assertEquals("nurse name", foundNurse.getName());
        assertEquals("janitor name", foundJanitor.getName());
    }

    @Test
    public void shouldBeAbleToHireACollectionOfEmployees(){
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        Collection<HospitalEmployee> hiredEmployees = underTest.getAllEmployees();
        assertThat(hiredEmployees, containsInAnyOrder(doctor, nurse, janitor));
    }

    @Test
    public void shouldDisplayAllMedicalPersonnel(){
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        Collection<HospitalEmployee> medicalEmployees = underTest.getMedicalEmployees();
        assertThat(medicalEmployees, containsInAnyOrder(doctor, nurse));
    }

    @Test
    public void shouldAdmitTwoPatients(){
        Patient sickPatient = new Patient();
        Patient sickerPatient = new Patient(5, 10);
        underTest.admit(sickPatient);
        underTest.admit(sickerPatient);
        Collection<Patient> admittedPatients = underTest.getAllPatients();
        assertThat(admittedPatients, containsInAnyOrder(sickerPatient, sickerPatient));


            }
        }

    }

}
