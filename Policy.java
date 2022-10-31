public class Policy
{
   //Fields
   private int PolicyNumber;
   private String ProviderName;
   private PolicyHolder policyholder; 
   private static int instanceCount;
 
   /**
      Constructor to fully initialize the policy object
      @param PNumber The Policy Number
      @param PName The Provider Name
      @param PhFirstName The Policyholder's First Name
      @param PhLastName The Policyholder's Last Name 
      @param PhAge The Policyholder's Age 
      @param PhSmokingStatus The Policyholder's Smoking Status
      @param PhHeight The Policyholder's Height
      @param PhWeight The Policyholder's Weight
   */
   public Policy(int PNumber,String PName, PolicyHolder policy)
   {
     PolicyNumber = PNumber;
     ProviderName = PName;
     policyholder = new PolicyHolder(policy);
   }
   
   //Setters
   
   /**
      Mutator (setter) method
      @param PNumber The Policy Number
   */
      
   public void setPolicyNumber(int PNumber)
   {
     PolicyNumber = PNumber;   
   }
   
   /**
     Mutator (setter) method
     @param PName The provider name
   */
   public void setProviderName(String Pname)
   {
     ProviderName = Pname;
   }
  
   //Getters 
   
   /**
     Accessor (getter) method
     @return the policy number
   */
   public int getPolicyNumber()
   {
     return PolicyNumber;
   }
   
   
   /**
     Accessor (getter) method 
     @return the provider name 
   */
   public String getProviderName()
   {
     return ProviderName;
   }
   
    
   //Ohter methods 
   
   /**
     Calculates the BMI
     @param The Policyholder's Height
     @param The Policyholder's Weight 
     @return The calculated BMI 
   */
   
   public double getBMI()
   {
     final double CONVFACTOR = 703;
     return (policyholder.getHoldersWeight() * CONVFACTOR)/ (policyholder.getHoldersHeight() * policyholder.getHoldersHeight());
   }
   

   /**
     Calculates the price of the insurance policy
     @param The Policyholder's Age 
     @param The Policyholder's Smoking Status 
     @param The calculated BMI
     @return The calculated price of insurance policy
   */
   
   public double getInsurancePolicyPrice()
   {
     final double BASE_PRICE = 600;
     final double ADDITIONAL_FEE_AGE = 75;
     final double ADDITIONAL_FEE_SMOKING = 100;
     final double ADDITIONAL_FEE_PER_BMI = 20;
     
     final int AGE_THRESHOLD = 50;
     final int BMI_THRESHOLD = 35;
     
     double price = BASE_PRICE;
       
     if(policyholder.getHoldersAge() > AGE_THRESHOLD)
     {
       price += ADDITIONAL_FEE_AGE; //75
     }
     
     if(policyholder.getHoldersSmokingStatus().equalsIgnoreCase("smoker"))
     {
       price += ADDITIONAL_FEE_SMOKING; //100
     }
     
     if(getBMI() > BMI_THRESHOLD)
     {
       price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
     }
     
     return price;
   }
   
   /**
    toString method
    @return A string containing the policy information
   */
   
   public String toString()
   {
     return String.format("Policy Number: " + PolicyNumber +
            "\nProvider Name: " + ProviderName +
            policyholder.toString() + 
            "\nPolicyholder's BMI: " + getBMI() +
            "\nPolicy Price: " + getInsurancePolicyPrice());
   }
   
}//End of Class