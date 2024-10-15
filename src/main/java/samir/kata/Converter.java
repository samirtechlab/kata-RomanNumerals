package samir.kata;

public abstract class Converter {

  int numeralValue = 0;
  char romanValue = 'I';

  abstract int convert(char romanNumeral, char nextRomanNumeral);

 abstract int subtract(char previousRomanNumeral);

 boolean isMe(char romanNumeral){
   return romanNumeral == romanValue;
 };
}
