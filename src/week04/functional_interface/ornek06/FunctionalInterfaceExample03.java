package week04.functional_interface.ornek06;

public class FunctionalInterfaceExample03 {

    public static void main(String[] args) {
        String inputText = "Merhaba Dünya 2077";
        // (a,b) -> {    }
        /*StringTransformer toUpperCaseTransformer = (input) -> {
            return input.toUpperCase();
        };*/
        StringTransformer toUpperCaseTransformer = String::toUpperCase;
        String transformedText = toUpperCaseTransformer.transform(inputText);
        System.out.println(transformedText);
    }
}
