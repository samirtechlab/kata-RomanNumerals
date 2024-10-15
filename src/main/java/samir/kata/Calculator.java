package samir.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {

  public static int calculate(String romanNumerals, List<Convertor> converters) {

    int result = 0;
    char previousNumber = Character.MIN_VALUE;

    for (int i = 0; i < romanNumerals.length(); i++) {
      for (Convertor convertor : converters) {
        System.out.println(previousNumber + " " + i);
        if(i-1 >= 0) {
          var previousIteration = i - 1;
          previousNumber = romanNumerals.toCharArray()[previousIteration];
        }
        result += convertor.convert(romanNumerals.toCharArray()[i], previousNumber);
      }
    }
    return result;
  }

  public static void main(String[] args) {

    var X = 10;

    var test = "III";

    var convertors = new ArrayList<Convertor>(Arrays.asList(new IConvertor()));







  }
}