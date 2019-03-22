package fr.norsys.sinaf.Dossier;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DossierTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DossierTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DossierTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void DossierApp()
    {
        assertTrue( true );
    }
}
