package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test public void testAddsTwoAndTwo() {
    Calculator calc = new Calculator();
    assertEquals("2 + 2 should equal 4", Integer.valueOf(4), calc.add(2, 2));
  }

  @Test public void testMultipliesFourAndFour() {
    Calculator calc = new Calculator();
    assertEquals("4 * 4 should equal 16", Integer.valueOf(16), calc.multiply(4, 4));
  }  
}
