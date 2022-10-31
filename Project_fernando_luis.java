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
        
        //Create Policy holder object
        PolicyHolder policyholder = new PolicyHolder(HoldersFirstName, HoldersLastName, HoldersAge, HoldersSmokingStatus, HoldersHeight, HoldersWeight);
        
        //Create Policy object
        Policy policy = new Policy(PolicyNumber, ProviderName, policyholder);
        
        policies.add(policy);   
         
      }//Close loop
      
      inputFile.close(); //Close the file
      
      
    
     for(int i = 0; i < policies.size(); i++)
     {
       System.out.println(policies.get(i));
       System.out.println();
     }
 
     

    }//End of try
    
    catch(IOException ex)
    {
      System.out.println("Something went wrong reading the file " + ex.getMessage());
      
    }
  
  }
}