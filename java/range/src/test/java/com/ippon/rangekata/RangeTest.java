package com.ippon.rangekata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RangeTest {

    @Test
    void todo(){
        // GIVEN
        Range range = new Range();

        // WHEN
        String result = range.helloWorld();

        // THEN
        assertThat(result).isEqualTo("Hello World");
    }
}
