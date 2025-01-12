import java.util.*;
class compare{
public static void main(String args[]){
Scanner value = new Scanner(System.in);
System.out.println("Enter number a: ");
int a = value.nextInt();
System.out.println("Enter number b: ");
int b = value.nextInt();
if(a>b){System.out.println("a is greater");}
else if(b>a){System.out.println("b is greater");}
else{System.out.println("EQUAL");}
}
}