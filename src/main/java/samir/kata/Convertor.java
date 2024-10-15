package samir.kata;

public abstract class Convertor {
  int numeralValue;
  char romanValue;

  char previousValueThanSub;
  int valuePreviousValueThanSub;

  public Convertor() {}



  public int convert(char romanNumeral, char previousRomanNumeral) {
    return isMe(romanNumeral) ? (numeralValue - subtract(previousRomanNumeral)) : 0;
  }

  public int subtract(char previousRomanNumeral) {
    return previousRomanNumeral == previousValueThanSub ? valuePreviousValueThanSub*2 : 0;
  }

  public boolean isMe(char romanNumeral) {
    return romanNumeral == romanValue;
  }
}
