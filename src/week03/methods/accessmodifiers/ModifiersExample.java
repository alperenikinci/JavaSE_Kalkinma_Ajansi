package week03.methods.accessmodifiers;

import week03.methods.accessmodifiers.AccessLevel;

public class ModifiersExample extends AccessLevel{
    public static void main(String[] args) {
        AccessLevel accessLevel = new AccessLevel();
        System.out.println(accessLevel.publicString()); //public her yerden erişilir
        System.out.println(protectedString()); // protected kalıtım alındığı durumda her yerden erişilir
        System.out.println(defaultString()); // aynı paket içerisinde olan sınıflardan erişilir.
//        System.out.println(privateString()); // sadece sınıfın içerisinden erişilir.
    }

}
