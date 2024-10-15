package samir.kata;

import java.util.List;

public class Calculator {

  public static int calculate(String romanNumerals, List<Convertor> converters) {

    int result = 0;
    char previousNumber = Character.MIN_VALUE;

    for (int i = 0; i < romanNumerals.length(); i++) {
      for (Convertor convertor : converters) {
        if (i - 1 >= 0) {
          var previousIteration = i - 1;
          previousNumber = romanNumerals.toCharArray()[previousIteration];
        }
        result += convertor.convert(romanNumerals.toCharArray()[i], previousNumber);
      }
    }
    return result;
  }

  public static void main(String[] args) {

  }
}