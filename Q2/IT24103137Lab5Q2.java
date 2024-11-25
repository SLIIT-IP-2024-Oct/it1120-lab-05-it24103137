import java.util.Scanner;
  public class IT24103137Lab5Q2{
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of new member introduced:");
        int number = input.nextInt();
      if(number < 0)
            {
            System.out.print("input must be a number 0 or greater");
            }
      else {
        String prize;
       switch (number)
            {
         case 0:
            prize = "no prize";
            break;
         case 1:
            prize = "prize is a  : pen";
            break; 
         case 2:
            prize = "prize is a : umbrella";
            break;
         case 3:
            prize = "prize is a : bag";
            break;     
         case 4:
            prize = "prize is a : Travelling chair";
            break;  
         case 5:
            prize = "prize is a : Headphone";
            break;
         default:
            prize = "prize is a : Headphone ";
            }
         System.out.print(prize);
            }
       }
}  