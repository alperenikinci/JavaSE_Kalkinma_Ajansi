package week04.finalexamples.ornek05;

public class FinalStaticExample {
    private static final String COLON = ":";
    private static final String COMMA = ",";
    private static final String DOT = ".";

    public static void main(String[] args) {
        String uuid = "1231245";
        String request = "1231245";

        System.out.println("String Concat");
        System.out.println(uuid.concat(COLON).concat(request));

        System.out.println("String builder");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(uuid).append(COLON).append(request));
        
        String programmingLang = "Java,.NET,Python";
        String[] programmingLangArr = programmingLang.split(COMMA);
        for (String lang : programmingLangArr){
            System.out.println(lang);
        }
    }
}
