package samir.kata;

public class LConvertor implements Convertor{

  int numeralValue = 50;
  char romanValue = 'L';

  char previousValueThanSub = 'X';
  int valuePreviousValueThanSub = 10;

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
