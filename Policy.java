public class Policy
{
   //Fields
   private int PolicyNumber;
   private String ProviderName;
   private String PolicyholdersFirstName;
   private String PolicyholdersLastName;
   private int PolicyholdersAge;
   private String PolicyholdersSmokingStatus;
   private double PolicyholdersHeight;
   private double PolicyholdersWeight;
   
   /**
      no-arg constructor to set default values for all fields
   */
   public Policy()
   {
     PolicyNumber = 0;
     ProviderName = "None";
     PolicyholdersFirstName = "None";
     PolicyholdersLastName = "None";
     PolicyholdersAge = 0;
     PolicyholdersSmokingStatus = "None";
     PolicyholdersHeight = 0;
     PolicyholdersWeight = 0;
     
   }
   
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
   public Policy(int PNumber,String PName,String PhFirstName, String PhLastName, int PhAge, String PhSmokingStatus, double PhHeight, double PhWeight)
   {
     PolicyNumber = PNumber;
     ProviderName = PName;
     PolicyholdersFirstName = PhFirstName;
     PolicyholdersLastName = PhLastName;
     PolicyholdersAge = PhAge;
     PolicyholdersSmokingStatus = PhSmokingStatus;
     PolicyholdersHeight = PhHeight;
     PolicyholdersWeight = PhWeight; 
   }
   
   /**
      Mutator (setter) method
      @param PNumber The Policy Number
   */
      
   public void setPolicyNumber(int PNumber)
   {
     PolicyNumber = PNumber;   
   }
   
   /**
     Accessor (getter) method
     @return the policy number
   */
   public int getPolicyNumber()
   {
     return PolicyNumber;
   }
   
   /**
     Mutator (setter) method
     @param PName The provider name
   */
   public void setProviderName(String Pname)
   {
     ProviderName = Pname;
   }
   
   /**
     Accessor (getter) method 
     @return the provider name 
   */
   public String getProviderName()
   {
     return ProviderName;
   }
   
   /**
     Mutator (setter) method
     @param PhFirstName The policyholder's first name
   */
   public void setPolicyholdersFirstName(String PhFirstName)
   {
     PolicyholdersFirstName = PhFirstName;
   }
   
   /**
     Accessor (getter) method 
     @return The Policyholder's First Name
   */
   public String getPolicyholdersFirstName()
   {
     return PolicyholdersFirstName;
   }
   
   /**
     Mutator (setter) method
     @param PhLastName The policyholder's last name
   */
   public void setPolicyholdersLastName(String PhLastName)
   {
     PolicyholdersLastName = PhLastName;
   }
   
   /**
     Accessor (getter) method
     @return The Policyholder's Last Name
   */
   public String getPolicyholdersLastName()
   {
     return PolicyholdersLastName;
   }
   
   /**
     Mutator (setter) method
     @param PhAge The policyholder's age
   */
   public void setPolicyholdersAge(int PhAge)
   {
     PolicyholdersAge = PhAge;
   }
   
   /** 
     Accessor (getter) method 
     @return The Policyholder's Age 
   */
   public int getPolicyholdersAge()
   {
     return PolicyholdersAge;
   }
   
   /**
     Mutator (setter) method
     @param PhSmokingStatus Policyholder's smoking status either (smoker or non-smoker)
   */
   public void setPolicyholdersSmokingStatus(String PhSmokingStatus)
   {
     PolicyholdersSmokingStatus = PhSmokingStatus;
   }
   
   /**
     Accessor (getter) method
     @return Policyholder's smoking status 
   */
   public String getPolicyholdersSmokingStatus()
   {
     return PolicyholdersSmokingStatus;
   }
   
   /**
     Mutator (setter) method
     @param PhHeight The Policyholder's Height
   */
   public void setPolicyholdersHeight(double PhHeight)
   {
     PolicyholdersHeight = PhHeight; 
   }
   
   /**
     Accessor (getter) method
     @return The Policyholder's height 
   */
   public double getPolicyholdersHeight()
   {
     return PolicyholdersHeight;
   }
   
   /**
     Mutator (setter) method
     @param PhWeight The Policyholder's Weight
   */
   public void setPolicyholdersWeight(double PhWeight)
   {
     PolicyholdersWeight = PhWeight;
   }
   
   /**
     Accessor (getter) method 
     @return The policyholder's weight 
   */
   public double getPolicyholdersWeight()
   {
     return PolicyholdersWeight;
   }
   
   /**
     Calculates the BMI
     @param The Policyholder's Height
     @param The Policyholder's Weight 
     @return The calculated BMI 
   */
   public static double BMI(double PolicyholdersHeight,double PolicyholdersWeight)
   {
     return (PolicyholdersWeight * 703)/(PolicyholdersHeight * PolicyholdersHeight);
   }
   

   /**
     Calculates the price of the insurance policy
     @param The Policyholder's Age 
     @param The Policyholder's Smoking Status 
     @param The calculated BMI
     @return The calculated price of insurance policy
   */
   
   public static double InsurancePolicyPrice(int PolicyholdersAge, String PolicyholdersSmokingStatus, double BMI)
   {
     double PolicyholderFee = 600;
          
     if(PolicyholdersAge > 50)
     {
       PolicyholderFee += 75;
     }
     
     if(PolicyholdersSmokingStatus == "Smoker" || PolicyholdersSmokingStatus == "smoker")
     {
       PolicyholderFee += 100;
     }
     
     if(BMI > 35)
     {
       PolicyholderFee += ((BMI - 35) * 20);
     }
     
     return PolicyholderFee;
   }
   
}//End of Class