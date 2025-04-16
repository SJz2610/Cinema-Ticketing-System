public class Customer extends Person {

    //Data Members for Customer class
    private double LoyaltyPoints = 0.00;

    //Empty Constrcutor
    public Customer(){

    }

    //Parameterized Constructor 
    public Customer(String name, String email){
        super(name, email);
    }

    // Method to calculate Loyalty Points
    public void calculateLoyaltyPoints(double points){
        if (points < 0){
            System.out.println("Loyalty points cannot be negative.");
            return;
        }
        else {
            LoyaltyPoints += points;
        }
        
    }

    // Method to redeem Loyalty Points
    public double deductLoyaltyPoints(double redeemPoints){
        if (redeemPoints < 0){
            System.out.println("Loyalty points cannot be negative.");
            return LoyaltyPoints;
        }
        else if (redeemPoints > LoyaltyPoints){
            System.out.println("Not enough loyalty points to deduct.");
            return LoyaltyPoints;
        }
        else {
            LoyaltyPoints -= redeemPoints;
            return LoyaltyPoints;
        }
    }

    //Method to get Customer Information
    public String toString(){
        return String.format("Customer Name: %s\nEmail: %s\nLoyalty Points: %.2f", getName(), getEmail(), LoyaltyPoints);
    }
    
    //Getter for Loyalty Points
    public double getLoyaltyPoints(){
        return LoyaltyPoints;
    }
}
