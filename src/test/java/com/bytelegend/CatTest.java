package com.bytelegend;

import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void test() {
        Assersions.assertEquals("ABC", Cat.createNewCat("ABC"));
    }
}
