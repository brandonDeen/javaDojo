package com.brandondeen.challenges;

public class BinaryStringToInteger {
    public int convert(String binaryString) {
        int total = 0;
        for (int i = binaryString.length() - 1;  i>= 0; i--) {
            int binaryIndex = binaryString.length() - i - 1;
            total += binaryString.charAt(i) == '1' ? Math.pow(2, binaryIndex) : 0;
        }
        return total;
    }

    public int countOnes(String binaryString) {
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') { count++; }
        }

        return count;
    }
}
