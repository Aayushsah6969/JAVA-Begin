/*StringBuffer capacity() Method
The capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. Returns the current capacity. The capacity is the amount of storage available for newly inserted characters, beyond which an allocation will occur. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
*/

class SB6{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer();  
System.out.println(sb.capacity());//default 16  
//sb.append("Hello");  
//System.out.println(sb.capacity());//now 16  
sb.append("java is my favourite language"); 
//sb.append("KIIT java is my favourite language"); 
sb.append("KIITUn");
//System.out.println(sb);
System.out.println(sb.capacity());  
}  
}  