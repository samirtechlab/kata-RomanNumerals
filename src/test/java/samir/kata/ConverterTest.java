package samir.kata;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConverterTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void shouldBe1forI(){
    assertEquals(1, IConvertor.calculate("I"));
  }

  @Test
  public void shouldIncrementI(){
    assertEquals(2, IConvertor.calculate("II"));
  }




}