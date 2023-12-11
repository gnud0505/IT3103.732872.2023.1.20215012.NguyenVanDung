// Exercise 6.4: CountDaysOfMonth.java
import java.util.Scanner;

public class CountDaysOfMonth {
    public static void main(String[] argrs){
        Scanner Scanner=new Scanner(System.in);
        while (true) {
            String Month= Scanner. nextLine();
            int Year= Scanner. nextInt();
            if(CheckInput(Month, Year)){
                System.out.println(" Days in month: "+DaysInMonth(Month, Year));
                break;
            }
            else
            System.out.println("input errors, please enter again");
            Scanner.nextLine();
        }
        Scanner.close();
    }
    public static boolean CheckInput(String month, int year){
        if(year <0||DaysInMonth(month, year)==-1)
        return false;
        return true;
    }
    public static boolean CheckLapYear(int year){
        if(year%4!=0||(year %100==0 && year%400!=0)){
            return false;
        }
        return true;
    }
    public static int DaysInMonth(String month, int year){
        switch (month) {
            case "Janualy":
            case "Jan.":
            case "Jan":
            case "1":
            case "March":
            case "Mar.":
            case "Mar":
            case "3":
            case "May":
            case "5":
            case "July":
            case "Jul.":
            case "Jul":
            case "7":
            case "August":
            case "Aug.":
            case "Aug":
            case "8":
            case "October":
            case "Oct.":
            case "Oct":
            case "10":
            case "December":
            case "Dec.":
            case "Dec":
            case "12":
            return 31;
                       
            case "April":
            case "Apr.":
            case "Apr":
            case "4":
            case "June":
            case "Jun.":
            case "Jun":
            case "6":
            case "September":
            case "Sep.":
            case "Sep":
            case "9":
            case "November":
            case "Nov.":
            case "Nov":
            case "11":
            return 30;
             
            case "Feburary":
            case "Feb.":
            case "Feb":
            case "2":
            return CheckLapYear(year) ? 29 :28;
           
            default:
            return -1;
        }
    }
}
