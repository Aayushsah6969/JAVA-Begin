class clearbit{
    public static void main(String[] args) {
        int n = 10;
        int pos = 3;
        int mask = 1<<pos;
        int not = ~(mask);
        int newNum = not & n;
        System.out.println("New Number: " + newNum);
    }
}