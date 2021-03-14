public class Rekurencja {
    public static void main(String[] args) {


        podaj(0);
        podaj(1);
        podaj(2);
        podaj(3);
        podaj(4);
        podaj(5);
        podaj(6);
        podaj(7);


    }

    public static long fib(long n) {

        if (n <= 1) return n;

        return fib(n - 2) + fib(n - 1);


    }

    public static void podaj(int n) {
        long ans = fib(n);
        if (n % 2 == 0) {
            ans = ans * -1;
            System.out.println(ans);
        }
        else
            System.out.println(ans);

    }


    public static void modulo(int liczba) {
        if (liczba % 2 == 0) {
            System.out.println("parzysta");
        } else {
            System.out.println("nie parzysta");
        }
    }

}
