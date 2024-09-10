public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

    public static void main(String[] args) {
        double cashValue = 101.99;
        int milesValue = 1234;

        //Test with a cash value
        RewardValue rewardFromCash = new RewardValue(cashValue);
        System.out.println("Cash value: $" + rewardFromCash.getCashValue());
        System.out.println("Equivalent miles: " + rewardFromCash.getMilesValue() + " miles");

        //Test with a miles value
        RewardValue rewardFromMiles = new RewardValue(milesValue);
        System.out.println("Miles value: " + rewardFromMiles.getMilesValue() + " miles");
        System.out.println("Equivalent cash: $" + rewardFromMiles.getCashValue());
    }

    }
