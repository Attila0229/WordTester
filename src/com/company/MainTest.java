package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void gyakorlok(){
        assertTrue(Main.sameWords("alma","laam"));
        assertTrue(Main.sameWords("tol","olt"));
        assertFalse(Main.sameWords("golyó","fogoly"));
        assertFalse(Main.sameWords("halk","klan"));
    }
}