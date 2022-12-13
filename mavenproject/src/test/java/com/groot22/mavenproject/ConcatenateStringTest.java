package com.groot22.mavenproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConcatenateStringTest {
	@Test
    public void testConcatenate() {
        ConcatenateString concatString = new ConcatenateString();

        String result = concatString.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
