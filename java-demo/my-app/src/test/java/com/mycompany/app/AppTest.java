package com.mycompany.app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldCreateInstanceWithoutProblem()
    {
        App myApp = new App();
        assertNotNull("myApp is null!!", myApp);
    }

    @Test
    public void shouldExecuteMain()
    {
        App.main(null);
    }
}
