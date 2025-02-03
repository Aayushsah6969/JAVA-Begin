import java.util.*;

class HrsException extends Exception{}
class MinException extends Exception{}
class SecException extends Exception{}

class Time{
    Scanner sc = new Scanner(System.in);
    int hour;
    int mins;
    int sec;
    public Time() {
        try{
            System.out.print("Enter hours: ");
            hour = sc.nextInt();
            if(hour > 24 || hour < 0){
                throw new HrsException();
            }
            System.out.println("Enter minutes: ");
            mins = sc.nextInt();
            if(mins > 60 || mins < 0){
                throw new MinException();
            }
            System.out.println("Enter Seconds: ");
            sec = sc.nextInt();
            if(sec > 60 || sec < 0){
                throw new SecException();
            }
            System.out.println("Time is: "+hour+":"+mins+":"+sec);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            sc.close();
        }
    }
}

class Main{
    public static void main(String arg[]){
        Time obj = new Time();
    }
}