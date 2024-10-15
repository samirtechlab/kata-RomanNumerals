package samir.kata;

public class XConvertor extends Converter{
  int numeralValue = 10;
  char romanValue = 'X';

  char previousValueThanSub = 'I';
  int valuePreviousValueThanSub = 1;

  @Override
  int convert(char romanNumeral, char previousRomanNumeral) {
    return isMe(romanNumeral) ? (numeralValue - subtract(previousRomanNumeral)) : 0;
  }

  @Override
  int subtract(char previousRomanNumeral) {
    return previousRomanNumeral == previousValueThanSub ? valuePreviousValueThanSub*2 : 0;
  }

  boolean isMe(char romanNumeral){
    return romanNumeral == romanValue;
  };
}
