/*In Java, call by value refers to calling a method by passing the value in the parameter. In Java, call by value passes a copy of the variable to the method, so all changes are reflected only in that method; thus, no changes are reflected in the main method. This is the main difference between call by value in java and call by reference in java. When we pass a variable with primitive data types, it is considered a call by values in Java, so any changes to the variable will not be reflected in the caller’s scope.
*/

//Example of Call by Value in Java
class Main{
    public static void increment(int number){
        number = number+1;  // increment variable by 1
        System.out.println("value in method: "+number);
    }
    
    public static void main(String[] args) {
        int number=10;
        System.out.println("value before method call : "+number);
        increment(number);
        System.out.println("value after method call: "+number);
    }
}

/*Output

value before method call: 10
value in method: 11
value after method call: 10
*/