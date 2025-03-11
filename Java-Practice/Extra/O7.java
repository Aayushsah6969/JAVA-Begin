/*
this: to pass as an argument in the method
The this keyword can also be passed as an argument in the method. It is mainly used in the event handling. 
*/
class O7{  
  void show(O7 obj){  
  System.out.println("Welcome to KIIT University");  
  }  
  void display(){  
  show(this);  
  }  
  public static void main(String args[]){  
  O7 ob = new O7();  
  ob.display();  
  }  
}  