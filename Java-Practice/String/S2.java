//String Handling in Java
// String objects are immutable
//compareTo(), compareToIgnoreCase()

class S2 {
    public static void main(String ar[]) {
        String str1 = "kIIT";
        String str2 = new String("KIIT");
        int l=str2.compareTo(str1);
        System.out.println(l);
        int j = str2.compareToIgnoreCase(str1);
        System.out.println(j);
    }
}