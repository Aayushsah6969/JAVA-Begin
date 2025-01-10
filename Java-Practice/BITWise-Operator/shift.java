class shift{
	public static void main(String args[]){
		int ls = 4<<1;
		int rs = 2>>2;
		System.out.println("Left shift = "+ls);
		System.out.println("Right shift = "+rs);
	}
}


/*#include <stdio.h>

int main() {
    int num = 8; // Binary: 1000

    // Left shift by 2 positions
    int leftShift = num << 2; // Binary: 1000 << 2 -> 100000
    printf("Left Shift (8 << 2): %d\n", leftShift); // Output: 32

    // Right shift by 2 positions
    int rightShift = num >> 2; // Binary: 1000 >> 2 -> 10
    printf("Right Shift (8 >> 2): %d\n", rightShift); // Output: 2

    return 0;
}
*/