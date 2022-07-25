package com.brandondeen.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryStringToIntegerTest {
    
    BinaryStringToInteger obj = new BinaryStringToInteger();

    @Test
    public void testConvert() {
        int randomInt = (int) Math.random();
        Assertions.assertAll("", 
                () -> Assertions.assertEquals(1, obj.convert("00000001")),
                () -> Assertions.assertEquals(2, obj.convert("00000010")),
                () -> Assertions.assertEquals(3, obj.convert("00000011")),
                () -> Assertions.assertEquals(4, obj.convert("00000100")),
                () -> Assertions.assertEquals(5, obj.convert("00000101")),
                () -> Assertions.assertEquals(6, obj.convert("00000110")),
                () -> Assertions.assertEquals(7, obj.convert("00000111")),
                () -> Assertions.assertEquals(randomInt, obj.convert(Integer.toBinaryString(randomInt)))
        );
    }
    
    @Test
    public void testCountOnes() {
        Assertions.assertAll("",
                () -> Assertions.assertEquals(1, obj.countOnes("00000001")),
                () -> Assertions.assertEquals(1, obj.countOnes("00000010")),
                () -> Assertions.assertEquals(2, obj.countOnes("00000011")),
                () -> Assertions.assertEquals(1, obj.countOnes("00000100")),
                () -> Assertions.assertEquals(2, obj.countOnes("00000101")),
                () -> Assertions.assertEquals(2, obj.countOnes("00000110")),
                () -> Assertions.assertEquals(3, obj.countOnes("00000111"))
        );
    }
    
}