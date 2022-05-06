package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {

    Surgeon underTest = new Surgeon("1", "name", "specialty", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelFrom10To20WhenCaringForPatient(){
        underTest.careForPatient();
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(15, healthLevel);
    }

    @Test
    public void shouldExpectASalaryOf100000k(){
        int salary = underTest.calculatePay();
        assertEquals(100000, salary);
    }
}
