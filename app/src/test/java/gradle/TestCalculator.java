public class TestCalculator {
    Calculator c = new Calculator();

    @Test
    void testSum(){
        assertEquals(2,c.sum(1,1));
    }

    @Test
    void testMul(){
        assertEquals(1,c.mul(1,1));
    }

    @Test
    void testSub(){
        assertEquals(0,c.sub(1,1));
    }

    @Test
    void testDiv(){
        assertEquals(1,c.div(1,1));
    }
}
