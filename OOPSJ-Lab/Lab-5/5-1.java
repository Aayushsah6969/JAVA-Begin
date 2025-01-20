abstract class student{
    int roll;
    int reg_no;
    void getinput(int r, int reg){
        roll = r;
        reg_no = reg;
    }
    abstract void course();
}
class kiitian extends student{          
    public void course(){
        System.out.println("Course - B.Tech. (Computer Science & Engg) ");
    }
}
class main{
    public static void main(String args[]){
        kiitian s = new kiitian();
        s.getinput(1915001, 11911001);
        System.out.println("Roll No: " + s.roll);
        System.out.println("Registration No: " + s.reg_no);
        s.course();
    }
}