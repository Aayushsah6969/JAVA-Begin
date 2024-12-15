class array_ages{
    public static void main(String args[]){
        int ages[] ={23, 21, 24, 25, 22, 23, 24, 25};
        int sum =0;
        float avg=0;
        int len = ages.length;
        for(int age : ages){
            sum += age;
        } 
        avg = sum/len;
        System.out.println("Sum of all ages: "+sum);
        System.out.println("Average of all ages: "+avg);
        

    }
}