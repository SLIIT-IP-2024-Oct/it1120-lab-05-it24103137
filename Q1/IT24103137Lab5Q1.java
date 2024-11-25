import java.util.Scanner;
 public class IT24103137Lab5Q1 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       int number1 , number2 , number3 , smallest , largest;
       System.out.print(" Enter the first integer: ");
         number1 = input.nextInt();
       System.out.print(" Enter the second integer: ");  
         number2 = input.nextInt();
       System.out.print(" Enter the third integer: ");   
         number3 = input.nextInt(); 
       System.out.println(" ");
       System.out.println(" used entered numbers are: " + number1 + " " + number2 + " " + number3);
         smallest = number1 ;
         largest = number1;
         if(number2 < smallest){
                                smallest = number2;
                               }
         if(number3 < smallest){
                               smallest = number3;
                               } 
          if(number2 > largest){ 
                               largest = number2;
                               }
         if(number3 > largest) { largest = number3;
                               } 
           System.out.println(" the smallest number is : " + smallest); 
           System.out.println(" the largest number is : " + largest); 
       }
}     