package Insurance;

public class HealthInsurance implements Insurance {

    String policyHolderName;
    int age;
    double basePremium;

    public HealthInsurance(String policyHolderName, int age, double basePremium) {
        this.policyHolderName = policyHolderName;
        this.age = age;
        this.basePremium = basePremium;
    }

    @Override
    public void calculatePremium() {
        double finalPremium;

        if (age > 45) {
            finalPremium = basePremium + (basePremium * 0.20); 
        } else {
            finalPremium = basePremium;
        }

        System.out.println("Policy Holder: " + policyHolderName);
        System.out.println("Age: " + age);
        System.out.println("Final Premium Amount: " + finalPremium);
    }
}
