package calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator calculator;
    static double a ;
    static double b ;
    static double res;
    @BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @BeforeEach
    void setUp() throws Exception {
        calculator = new Calculator();
        a = 5;
        b = 10;
        res = 0;
    }

    @Test
    void add() {
        res = calculator.add(a, b);
        assertEquals(15,res);
    }

    @Test
    void sub() {
        res = calculator.sub(a, b);
        assertEquals(-5,res);
    }

    @Test
    void mul() {
        res = calculator.mul(a, b);
        assertEquals(50,res);
    }

    @Test
    void div() {
        a = 10;
        b = 5;
        res = calculator.div(a, b);
        assertEquals(2,res);
    }

    @Test
    void testDivByZero() {
        b = 0;
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.div(a, b));
        String message = exception.getMessage();
        String expected = "Division by zero";
        assertEquals(expected, message);
    }

    @Test
    void pow() {
        res = calculator.pow(a, b);
        assertEquals(Math.pow(a,b),res);
    }

    @Test
    void sqrt() {
        res = calculator.sqrt(a);
        assertEquals(Math.sqrt(a),res);
    }
}