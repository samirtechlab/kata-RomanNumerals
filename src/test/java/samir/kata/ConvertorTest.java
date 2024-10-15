package samir.kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ConvertorTest {

  List<Convertor> converters = new ArrayList<>();

  @Before
  public void setUp() {
    converters.add(new IConvertor());
    converters.add(new VConvertor());
    converters.add(new XConvertor());
    converters.add(new LConvertor());
    converters.add(new CConvertor());
    converters.add(new DConvertor());
    converters.add(new MConvertor());
  }

  @Test
  public void shouldBe1forI() {
    assertEquals(1, Calculator.calculate("I", converters));
  }

  @Test
  public void shouldIncrementI() {
    assertEquals(2, Calculator.calculate("II", converters));
  }

  @Test
  public void shouldBe5forV() {
    assertEquals(5, Calculator.calculate("V", converters));
  }

  @Test
  public void shouldIncrementVI() {
    assertEquals(6, Calculator.calculate("VI", converters));
  }

  @Test
  public void shouldBe10forX() {
    assertEquals(10, Calculator.calculate("X", converters));
  }

  @Test
  public void shouldIncrementX() {
    assertEquals(20, Calculator.calculate("XX", converters));
  }

  @Test
  public void shouldBe9forIX() {
    assertEquals(9, Calculator.calculate("IX", converters));
  }

  @Test
  public void shouldBe50forL() {
    assertEquals(50, Calculator.calculate("L", converters));
  }


  @Test
  public void shouldBe40forXL() {
    assertEquals(40, Calculator.calculate("XL", converters));
  }

  @Test
  public void shouldBe100forC() {
    assertEquals(100, Calculator.calculate("C", converters));
  }

  @Test
  public void shouldBe90forXC() {
    assertEquals(90, Calculator.calculate("XC", converters));
  }

  @Test
  public void shouldBe500forD() {
    assertEquals(500, Calculator.calculate("D", converters));
  }

  @Test
  public void shouldBe400forCD() {
    assertEquals(400, Calculator.calculate("CD", converters));
  }

  @Test
  public void shouldBe1000forM() {
    assertEquals(1000, Calculator.calculate("M", converters));
  }

  @Test
  public void shouldBe900forCM() {
    assertEquals(900, Calculator.calculate("CM", converters));
  }

  @Test
  public void shouldBe123forCXXIII() {
    assertEquals(123, Calculator.calculate("CXXIII", converters));
  }

  @Test
  public void shouldBe2628forMMDCXXVIII() {
    assertEquals(2628, Calculator.calculate("MMDCXXVIII", converters));
  }

  @Test
  public void shouldBe463forCDLXIII() {
    assertEquals(463, Calculator.calculate("CDLXIII", converters));
  }

  @Test
  public void shouldBe1494forMCDXCIV() {
    assertEquals(1494, Calculator.calculate("MCDXCIV", converters));
  }

}