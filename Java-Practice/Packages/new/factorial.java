package mypack;
import mypack.fact;

public class factorial implements fact {
    // Implementing the method declared in the interface
    @Override
    public void factcall(int f) {
        int p = 1;
        for (int i = 1; i <= f; i++) { // Start from 1 instead of 0
            p = p * i;
        }
        System.out.println("Factorial of " + f + " is " + p);
    }
}
