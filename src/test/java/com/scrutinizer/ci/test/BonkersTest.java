package com.scrutinizer.ci.test;

import junit.framework.TestCase;

/**
 * Created by sabine on 20.08.15.
 */
public class BonkersTest extends TestCase {
    public void testMazing() throws Exception {
        Bonkers subject = new Bonkers();
        assertEquals(0, subject.mazing(0,0,0));
        assertEquals(3, subject.mazing(1,1,1));

    }
}