package com.taehoon.expirationmanage;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class ScoreCollectionTest {
    @Test
    public void answersArithmeticMeanOfTwoNumbers(){

        ScoreCollection collection = new ScoreCollection();
        collection.add(()-> 5);
        collection.add(()-> 7);

        int actualResult = collection.arithmeticMean();

        assertThat(actualResult,equalTo(6));
    }
}