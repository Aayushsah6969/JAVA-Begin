/*
Java String replace() Method
The String class replace() method replaces all occurrence of first sequence of character with second sequence of character.
*/
class S10 {
    public static void main(String ar[]) {
        String s1 = "Java is a programming language. Java is a platform Independent. Java is a robust language.";
        String r1 = s1.replace("Java", "Python");
        System.out.println(r1);
    }
}