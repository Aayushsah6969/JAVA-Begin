import java.util.*;
class details{
public static void main(String args[]){
Scanner detail = new Scanner(System.in);
System.out.println("Enter you name: ");
String name = detail.nextLine();
System.out.println("Enter you age: ");
int age = detail.nextInt();
System.out.println("Enter you cgpa: ");
float cgpa = detail.nextFloat();
System.out.println("Your name is: "+name+" age is: "+age+" cgpa is: "+cgpa);
}
}