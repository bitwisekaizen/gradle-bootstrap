package com.thegrayfiles;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestUnit {

    @Test
    public void canInstantiateUnit() {
        Unit unit = new Unit();
        assertTrue(unit != null);
    }
}