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
  //converters.add(new IConvertor());
  //converters.add(new XConvertor());
  converters.add(new VConvertor());
  //converters.add(new LConvertor());
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
  public void shouldBe5forV(){
    assertEquals(5, Calculator.calculate("V", converters));
  }

  @Test
  public void shouldIncrementVI(){
    assertEquals(6, Calculator.calculate("VI", converters));
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

  @Test
  public void shouldBe50forL(){
    assertEquals(50, Calculator.calculate("L", converters));
  }


  @Test
  public void shouldBe40forXL(){
    assertEquals(40, Calculator.calculate("XL", converters));
  }




}