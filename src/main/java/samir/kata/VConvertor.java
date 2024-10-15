package samir.kata;

public class VConvertor implements Convertor {

  int numeralValue = 5;
  char romanValue = 'V';

  char previousValueThanSub = 'I';
  int valuePreviousValueThanSub = 1;

  @Override
  public int convert(char romanNumeral, char previousRomanNumeral) {
    return isMe(romanNumeral) ? (numeralValue - subtract(previousRomanNumeral)) : 0;
  }

  @Override
  public int subtract(char previousRomanNumeral) {
    return previousRomanNumeral == previousValueThanSub ? valuePreviousValueThanSub*2 : 0;
  }

  @Override
  public boolean isMe(char romanNumeral) {
    return romanNumeral == romanValue;
  }
}
