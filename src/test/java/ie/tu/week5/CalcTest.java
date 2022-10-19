package ie.tu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calc();
    }

    @Test
    void testAdd()
    {
        assertEquals(3, myCalc.add(1, 2));
    }

    @Test
    void testConstructor()
    {
        assertThrows(IllegalArgumentException.class, ()-> {new Calc(4);} );
    }


    @AfterEach
    void tearDown() {

    }
}