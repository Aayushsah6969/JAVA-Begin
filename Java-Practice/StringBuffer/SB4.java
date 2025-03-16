/*StringBuffer delete() Method
The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.
*/
class SB4 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(0, 6);
        System.out.println(sb);// prints Hlo
    }
}