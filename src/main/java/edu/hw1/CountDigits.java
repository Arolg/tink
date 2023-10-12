package edu.hw1;

public class CountDigits {
    public int countDigits(int digit){
        if (digit == 0){
            return 1;
        }
        else {
            return (int) (Math.log10(digit) + 1);
        }
    }
}
