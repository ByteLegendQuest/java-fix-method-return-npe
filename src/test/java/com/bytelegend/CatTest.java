package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void test() {
        Assertions.assertEquals("ABC", Cat.createNewCat("ABC"));
    }
}
