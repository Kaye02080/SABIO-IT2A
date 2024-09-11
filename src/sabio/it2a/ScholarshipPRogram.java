import java.until.ArrayList;
import java.util.Scanner;

public class ScholarshipPRogram {
     
    private ArrayList<ScholarshipApplication> application;
    
 public ScholarshipProgram(){
     application = new Arraylist<>();  
 }   
 public void addApplication(String id, String name, double gpa, double annualIncome, int serviceHours){
 ScholarshipApplication application = new ScholarshipApplication(id, name, gpa, annualIncome, serviceHours);
 application.add(application);
 System.out.println("Application added succesfully.");
 }
  public void viewApplication(){
      if(application.isEmpty()){
          System.out.printlin("No application available."){
          
      }else{
            for(ScholarshipApplication application: application){
              application.displayApplicationDetail();
              System.out.println("---------------------------");
              }
         }
      }
      public void checkEligibility(){
          if(application.)
      }
  }
}
