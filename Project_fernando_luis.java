import java.util.*;
import java.io.*;

public class Project_fernando_luis
{
  public static void main(String[] args)
  {
    
    try 
    {
      //Create instance of the file class
      File file = new File ("PolicyInformation.txt");
      
      //Pass a reference to the File object as an argument to the Scanner class constructor
      Scanner inputFile = new Scanner (file);
      
      //Declare Variables 
      int PolicyNumber = 0, HoldersAge = 0, SmokerCount = 0, NonSmokerCount = 0;
      String ProviderName = "", HoldersFirstName = "", HoldersLastName = "", HoldersSmokingStatus = "";
      double HoldersHeight = 0.0, HoldersWeight = 0.0;
      
      //Create ArrayList to store objects. This arraylist will hold Policy objects
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //While loop to read the file
      while(inputFile.hasNext())
      {
        PolicyNumber = inputFile.nextInt();
        inputFile.nextLine();
        ProviderName = inputFile.nextLine();
        HoldersFirstName = inputFile.nextLine();
        HoldersLastName = inputFile.nextLine();
        HoldersAge = inputFile.nextInt();
        inputFile.nextLine();
        HoldersSmokingStatus = inputFile.nextLine();
        HoldersHeight = inputFile.nextDouble();
        HoldersWeight = inputFile.nextDouble();
        
        if(inputFile.hasNext())
        { 
          inputFile.nextLine();
          inputFile.nextLine();
        }
        
        //Create Policy object
        Policy policy = new Policy(PolicyNumber, ProviderName, HoldersFirstName, HoldersLastName, HoldersAge, HoldersSmokingStatus, HoldersHeight, HoldersWeight);
        
        policies.add(policy);   
         
      }//Close loop
      
      inputFile.close(); //Close the file
      
      //display the output
      for(int i = 0; i < policies.size(); i++)
      {
        System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
        System.out.println("Provider Name: " + policies.get(i).getProviderName());
        System.out.println("Policyholder's First Name: " + policies.get(i).getPolicyholdersFirstName());
        System.out.println("Policyholder's Last Name: " + policies.get(i).getPolicyholdersLastName());
        System.out.println("Policyholder's Age: " + policies.get(i).getPolicyholdersAge());
        System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(i).getPolicyholdersSmokingStatus());
        System.out.println("Policyholder's Height: " + policies.get(i).getPolicyholdersHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policies.get(i).getPolicyholdersWeight() + " pounds");
        System.out.printf("Poloicyholder's BMI: %.2f\n", policies.get(i).getBMI());
        System.out.println("Policy Price: $" + policies.get(i).getInsurancePolicyPrice());
        System.out.println();
        
        if(policies.get(i).getPolicyholdersSmokingStatus().equalsIgnoreCase("smoker"))    
        {
          SmokerCount ++;
        }  
        else 
        NonSmokerCount ++;         
        
     } 
      
     System.out.println("The number of policies with a smoker is: " + SmokerCount);   
     System.out.println("The number of policies with a non-smoker is: " + NonSmokerCount);
      

    }//End of try
    
    catch(IOException ex)
    {
      System.out.println("Something went wrong reading the file " + ex.getMessage());
      
    }
  
  }
}