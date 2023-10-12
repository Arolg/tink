package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsTest {

    @Test
    void countDigits() {
        CountDigits test = new CountDigits();
        int digit = 4666;
        int response = test.countDigits(digit);
        org.assertj.core.api.Assertions.assertThat(response).isEqualTo(4);
    }
    @Test
    void countDigits1() {
        CountDigits test = new CountDigits();
        int digit = 0;
        int response = test.countDigits(digit);
        org.assertj.core.api.Assertions.assertThat(response).isEqualTo(1);
    }
}
