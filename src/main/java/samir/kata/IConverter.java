package samir.kata;

public class IConverter extends Converter{

  int numeralValue = 1;
  char romanValue = 'I';

  @Override
  public int convert(char romanNumeral, char previousRomanNumeral) {

    return isMe(romanNumeral) ? numeralValue : 0;
  }

  @Override
  public int subtract(char previousRomanNumeral) {
    return 0;
  }


  @Override
  public boolean isMe(char romanNumeral) {
    return romanNumeral == romanValue;
  }

}
