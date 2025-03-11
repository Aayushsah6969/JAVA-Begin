/*
this: to pass as argument in the constructor call
We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes. 
*/

class B{  
  O8 obj;  
  B(O8 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of A4 class  
  }  
}  
  
class O8{  
  int data=10;  
  O8(){  
   B b=new B(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   O8 a=new O8();  
  }  
}  