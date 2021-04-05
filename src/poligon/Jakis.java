package poligon;

public interface Jakis {

    static void staticMethod() { }

    void method();

    default void defaultMethod() { }

    abstract void abstractMethod();
}
