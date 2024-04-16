package week05.function;

import java.util.function.Function;

public class FunctionTest06 {
    public static void main(String[] args) {
        // Metin dizgisini (String) alıp sayıları çıkaran bir Function tanımlayalım.
        Function<String,String> extractNumbers = text -> {
          StringBuilder numbers = new StringBuilder();
          for (char c : text.toCharArray()){
              if(Character.isDigit(c)){
                  numbers.append(c);
              }
          }
          return numbers.toString();
        };
        String sentence = " I have 3 apples and 5 oranges";
        String extractedNumbers = extractNumbers.apply(sentence);
        System.out.println("Extracted numbers : " + extractedNumbers);
    }
}
