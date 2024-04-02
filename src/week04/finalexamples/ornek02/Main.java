package week04.finalexamples.ornek02;

public class Main extends FinalMethodExample02{

//    public final void display(String name){
//        System.out.println("This is display method.");
//    } -> overload ederek kullanabilirim.

//    @Override
//        public final void display(S){
//        System.out.println("This is display method.");
//    } -> Bunu kullanmama izin vermez. Çünkü method superclass'da
    // final olarak tanımlanmış.
    @Override
    public void sayHello() {
        System.out.println("Hello Java Class");
    }
}
