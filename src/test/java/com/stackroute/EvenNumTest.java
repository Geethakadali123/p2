package com.stackroute;
import org.junit.Test;
import  org.junit.Assert.*;

import static org.junit.Assert.assertEquals;


public class EvenNumTest {
    @Test
    public void Evencheck(){
        assertEquals(true,EvenNum.isEven(2));
    }
    @Test
    public void Eventest(){
        assertEquals(true,EvenNum.isEven(24));
    }
    @Test
    public void Noteven(){
        assertEquals(false,EvenNum.isEven(13));
    }
}
