package hospital;

public class Patient {

    private int healthLevel;
    private int bloodLevel;


    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;

    }

    public int getHealthLevel() {
        return healthLevel();

        public Patient() {
            healthLevel = 10;
            bloodLevel = 20;

        }
        public void increaseHealthLevel(int healthIncreaseAmount ){
            healthLevel += healthIncreaseAmount;
        }
        public void decreaseBloodLevel(int bloodDecreaseAmount) {
            bloodLevel -= bloodDecreaseAmount;

    }


    public int getBloodLevel() {
        return bloodLevel;
    }


}

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
