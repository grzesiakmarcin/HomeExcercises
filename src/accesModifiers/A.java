package accesModifiers;

public class A {

    private A() { }

    void invokeB() {
        B objB = new B(); // (1)
        int b = objB.b;   // (2)
      //  int c = objB.c;   // (3)
    }

}
