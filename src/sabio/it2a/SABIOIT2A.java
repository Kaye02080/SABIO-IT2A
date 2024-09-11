
package sabio.it2a;


public class SABIOIT2A {
    
    public static void main(String[] args) {
          private String id;
          private String name;
          private double gpa;
          private double annualIncome;
          private int communityServiceHours;
          
          
          
      public ScholarshipApplication(String id, String name, double gpa, double annualIncome, int communityServiceHours){
          this.id = id;
          this.name = name;
          this.gpa = gpa;
          this.annualIncome = annualIncome;
          this.communityServiceHours = communityServiceHours;
         
      }
         public String getId(){
             return id;
         }
         public String getName(){
             return name;
         }
         public double getGpa(){
             return gpa;
         }
         public double getAnnualIncome(){
             return annualIncome;
         }
         public int getCommunityServiceHours(){
             return communityServiceHours;
         }
         public void displayApplicationDetails(){
             System.out.println("ID: " + id);
             System.out.println("Name: " + name);
             System.out.println("GPA: "+ gpa);
             System.out.println("Annual Family Income: "+ annualIncome);
             System.out.println("CommunityServiceHours: " + communityServiceHours);
         }
    }
    
}
