//String Handling in Java
// String objects are immutable
/*length(), concat(), compareTo(), compareToIgnoreCase()
*/
class S1 {
    public static void main(String ar[]) {
        String str1 = "KIIT";
        String str2 = new String("KIIT");
        int l = str2.length();
        System.out.println(l);
        str1=str1.concat(str2);
        // str2=str1.concat(str2);
        System.out.println(str1);
    }
}