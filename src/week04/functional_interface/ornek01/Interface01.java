package week04.functional_interface.ornek01;

@FunctionalInterface
public interface Interface01 {
    public void abstractMethod(); // 1 tane abstract method olmalı.
//    public void abstractMethod2(); -> 2 taneye izin yok. Min 1, Max 1 method.
}
