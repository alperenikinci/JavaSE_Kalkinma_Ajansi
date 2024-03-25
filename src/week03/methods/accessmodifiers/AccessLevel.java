package week03.methods.accessmodifiers;

public class AccessLevel {
    public String publicString(){
        return "public string";
    }
    private static String privateString(){
        return "private string";
    }
    protected static String protectedString(){
        return "protected string";
    }
    static String defaultString(){
        return "default string";
    }

}
