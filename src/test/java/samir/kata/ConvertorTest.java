package samir.kata;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConvertorTest {

  List<Convertor> converters = new ArrayList<>();

  @Before
  public void setUp() throws Exception {
  converters.add(new IConvertor());
  converters.add(new XConvertor());
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void shouldBe1forI(){
    assertEquals(1, Calculator.calculate("I", converters));
  }

  @Test
  public void shouldIncrementI(){
    assertEquals(2, Calculator.calculate("II", converters));
  }

  @Test
  public void shouldBe10forX(){
    assertEquals(10, Calculator.calculate("X", converters));
  }

  @Test
  public void shouldIncrementX(){
    assertEquals(20, Calculator.calculate("XX", converters));
  }

  @Test
  public void shouldBe9forIX(){
    assertEquals(9, Calculator.calculate("IX", converters));
  }




}