class palindrome {
    public static void main(String args[]) {
        int value = 121;
        int original = value;
        int i = 0, j = 0;
        while (value != 0) {
            i = value % 10;
            j = j * 10 + i;
            value = value / 10;
        }
        if (j == original) {
            System.out.println("YES PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
    }
}