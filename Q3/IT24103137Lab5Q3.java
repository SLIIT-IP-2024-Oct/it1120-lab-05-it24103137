import java.util.Scanner;
      public class IT24103137Lab5Q3{
           public static void main(String[] asrgs){
               Scanner input = new Scanner(System.in);
               final double roomChargePerDay = 48000;
                     double discount = 0.0;
               System.out.print("Enter start date(1-31):");
                  int startDate = input.nextInt();
               System.out.print("Enter End  date(1-31):");
                  int endDate = input.nextInt();
            if(startDate < 1  || endDate > 31){
               System.out.print("Error: must be between 1 and 31");
                                               }
            else if(startDate > endDate){
               System.out.print("Error: Start Date must be less than End Date");
                return;
                                        }
                  System.out.print("\n");
              System.out.println("Room charge per Day: Rs." + roomChargePerDay);
                int numberOfDaysReserved;
                numberOfDaysReserved = endDate - startDate;
           System.out.println("number of days reserved:" +  numberOfDaysReserved);
                  if(numberOfDaysReserved >= 3){
                      discount = 0.1;
                                                     }
                 else if(numberOfDaysReserved >=5){
                      discount = 0.2;
                                           }
           double totalAmount = ((roomChargePerDay * numberOfDaysReserved)*(1-discount));
              System.out.println("total amount to be paid : " + totalAmount);  
           }
}
              
                
     
            