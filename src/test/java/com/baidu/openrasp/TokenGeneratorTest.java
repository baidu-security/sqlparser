package com.baidu.openrasp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

/**
 * Unit test for simple TokenGenerator.
 */
public class TokenGeneratorTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TokenGeneratorTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TokenGeneratorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        String case1[] = TokenGenerator.tokenize("select 123 from dual where 1=1 and{`whatever`1=1}");
        String result1[] = {"select", "123", "from", "dual", "where", "1", "=", "1", "and", "{", "`whatever`", "1", "=", "1", "}"};
        assertTrue(Arrays.equals(case1, result1));
    }
}
