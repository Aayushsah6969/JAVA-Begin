//public void printStackTrace()
/*
printStackTrace() method of java.lang.Throwable
class used to print this Throwable object along with
other details like class name and line number where
the exception occured means its backtrace.
*/
class E6 {
    public static void main(String ar[]) {
        try {
            throw new ArrayIndexOutOfBoundsException("KIIT");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}