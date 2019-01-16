package com.drelang;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public final static Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Rigorous PackageTest :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
