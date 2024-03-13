package Assignment1;
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {

        System.out.print("Enter the Year : ");
        
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)){
            System.out.println(year + " is a leap year using If else loop");

        }else {
            System.out.println(year + " is not leap year using If else Loop");
        }

        switch (LeapYear){

            case 1: System.out.println(year + " is a leap year using Switch Case");
            break;
            case 0: System.out.println(year + " is a leap year using Switch Case");
            break;
        }
    }
}
