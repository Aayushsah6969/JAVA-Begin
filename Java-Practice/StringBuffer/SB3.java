/*The replace() method replaces the given String from the specified beginIndex and endIndex.
*/

class SB3 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(0, 2, "Java");
        System.out.println(sb);// prints HJavalo
    }
}