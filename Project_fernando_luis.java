import java.util.Scanner; //Scanner Class

public class Project_fernando_luis
{
  public static void main (String[] args)
  {
    //Variables
    int PolicyNumber;
    String ProviderName;
    String PolicyholdersFirstName;
    String PolicyholdersLastName;
    int PolicyholdersAge;
    String PolicyholdersSmokingStatus;
    double PolicyholdersHeight;
    double PolicyholdersWeight;

    
    //Scanner object to read input
    Scanner keyboard = new Scanner(System.in);
    
    //Ask for the Policy Number 
    System.out.print("Please enter the Policy Number: ");
    PolicyNumber = keyboard.nextInt(); 
        
    keyboard.nextLine(); //Consume the remaining line 
    
    //Ask for the Provider Name
    System.out.print("Please enter the Provider Name: ");
    ProviderName = keyboard.nextLine(); 
    
    //Ask for the Policyholder's First Name    
    System.out.print("Please enter the Policyholder's First Name: ");
    PolicyholdersFirstName = keyboard.nextLine();  
    
    //Ask for the Policyholder's Last Name    
    System.out.print("Please enter the Policyholder's Last Name: ");
    PolicyholdersLastName = keyboard.nextLine(); 
    
    //Ask for the Policyholder's Age       
    System.out.print("Please enter the Policyholder's Age: ");
    PolicyholdersAge = keyboard.nextInt(); 
        
    keyboard.nextLine(); //Consume the remaing line
    
    //Ask for the Policyholder's Smoking Status 
    System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-somker): ");
    PolicyholdersSmokingStatus = keyboard.nextLine(); 
    
    //Ask for the Policyholder's Height
    System.out.print("Please enter the Policyholder's Height (in inches): ");
    PolicyholdersHeight = keyboard.nextDouble();  
    
    //Ask for the Policyholder's Weight 
    System.out.print("Please enter the Policyholder's Weight (in pounds): ");
    PolicyholdersWeight = keyboard.nextDouble(); 
        
    //Instatiate
    Policy policy1 = new Policy(PolicyNumber, ProviderName, PolicyholdersFirstName, PolicyholdersLastName, PolicyholdersAge, PolicyholdersSmokingStatus, PolicyholdersHeight, PolicyholdersWeight);
    
    //Show Information
    System.out.println("\nPolicy Number: " + policy1.getPolicyNumber());
    
    System.out.println("\nProvider Name: " + policy1.getProviderName());
    
    System.out.println("\nPolicyholder's First Name: " + policy1.getPolicyholdersFirstName());
    
    System.out.println("\nPolicyholder's Last Name: " + policy1.getPolicyholdersLastName());
    
    System.out.println("\nPolicyholder's Age: " + policy1.getPolicyholdersAge());
    
    System.out.println("\nPolicyholder's Smoking Status: " + policy1.getPolicyholdersSmokingStatus());
    
    System.out.println("\nPolicyholder's Height: " + policy1.getPolicyholdersHeight() + " inches");
    
    System.out.println("\nPolicyholder's Weight: " + policy1.getPolicyholdersWeight() + " pounds");
    
    System.out.printf("\nPolicyholder's BMI: %,.2f", policy1.BMI(policy1.getPolicyholdersHeight(), policy1.getPolicyholdersWeight()));
    
    System.out.printf("\n\nPolicy Price: $%,.2f", policy1.InsurancePolicyPrice(policy1.getPolicyholdersAge(), policy1.getPolicyholdersSmokingStatus(), policy1.BMI(policy1.getPolicyholdersHeight(), policy1.getPolicyholdersWeight())));
  }
}