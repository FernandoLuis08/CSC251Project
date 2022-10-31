public class PolicyHolder
{
  //fields
  private String HoldersFirstName;
  private String HoldersLastName;
  private int HoldersAge;
  private String HoldersSmokingStatus = "";
  private double HoldersHeight;
  private double HoldersWeight;
  
 
  /**
    Constructor that initializes fields
    @param FName The holder's First name
    @param LName The holder's Last Name
    @param Age The holder's Age
    @param SmokingStatus The holder's smoking status 
    @param Height The holder's height
    @param Weight The holder's weight 
  */
  public PolicyHolder(String FName, String LName, int Age, String SmokingStatus, double Height, double Weight)
  {
    FName = HoldersFirstName;
    LName = HoldersLastName;
    Age = HoldersAge; 
    SmokingStatus = HoldersSmokingStatus;
    Height = HoldersHeight;
    Weight = HoldersWeight;
  }
  
  /**
    The copy constructor creates a copy of the TextBook class that it is passed as a parameter.
     We use this to avoid secuirty holes.
     @param object2 - the object to copy
   */
  public PolicyHolder(PolicyHolder object2)
  {
    HoldersFirstName = object2.HoldersFirstName;
    HoldersLastName = object2.HoldersLastName;
    HoldersAge = object2.HoldersAge;
    HoldersSmokingStatus = object2.HoldersSmokingStatus;
    HoldersHeight = object2.HoldersHeight;
    HoldersWeight = object2.HoldersWeight;
    
  }
  
  //Setters
  
  /**
     Mutator (setter) method
     @param Name The policyholder's first name
  */
  public void setHoldersFirstName(String Name)
  {
    Name = HoldersFirstName;
  }
  
  /**
    Mutator (setter) method
    @param Name The policyholder's last name
  */
  public void setHoldersLastName(String Name)
  {
    Name = HoldersLastName;
  }
  
  /**
    Mutator (setter) method
    @param age The policyholder's age
  */
  public void setHoldersAge(int age)
  {
    age = HoldersAge;
  }
  
  /**
    Mutator (setter) method
    @param status Policyholder's smoking status either (smoker or non-smoker)
  */
  public void setHoldersSmokingStatus(String status)
  {
    status = HoldersSmokingStatus;
  }
  
  /**
    Mutator (setter) method
    @param height The Policyholder's Height
  */
  public void setHoldersHeight(double height)
  {
    height = HoldersHeight;
  }
  
  /**
    Mutator (setter) method
    @param weight The Policyholder's Weight
  */
  public void setHoldersWeight(double weight)
  {
    weight = HoldersWeight;
  }
  
  //getters
  
  /**
    Accessor (getter) method 
    @return The Policyholder's First Name
  */
  public String getHoldersFirstName()
  {
    return HoldersFirstName;
  }
  
  /**
    Accessor (getter) method
    @return The Policyholder's Last Name
  */
  public String getHoldersLastName()
  {
    return HoldersLastName;
  }
  
  /** 
    Accessor (getter) method 
    @return The Policyholder's Age 
  */
  public int getHoldersAge()
  {
    return HoldersAge;
  }
  
  /**
    Accessor (getter) method
    @return Policyholder's smoking status 
  */
  public String getHoldersSmokingStatus()
  {
    return HoldersSmokingStatus;
  }
  
  /**
    Accessor (getter) method
    @return The Policyholder's height 
  */
  public double getHoldersHeight()
  {
    return HoldersHeight;
  }
  
  /**
    Accessor (getter) method 
    @return The policyholder's weight 
  */
  public double getHoldersWeight()
  {
    return HoldersWeight;
  }
  
  
  /**
    toString method
    @return A string containing the Policy Holder's information
  */
   
   public String toString()
   {
     return String.format("Policyholder's First Name: " + HoldersFirstName +
            "\nPolicyholder's Last Name: " + HoldersLastName + 
            "\nPolicyholder's Age: " + HoldersAge + 
            "\nPolicyholder's Smoking Status (Y/N): " + HoldersSmokingStatus + 
            "\nPolicyholder's Height: %.2f", HoldersHeight ,
            "\nPolicyholder's Weight: %.2f\n", HoldersWeight);
   }

}