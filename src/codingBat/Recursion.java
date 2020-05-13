package codingBat;

public class Recursion {

    int n =12;

    NewClass nC = new NewClass();



}


class NewClass{
    public int factorial(int n) {

        if(n==1){
            return n;
        }
        else{
            return n*factorial(n-1);
        }

    }


    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        else {
            return 2 + bunnyEars(bunnies - 1); //dwoje uszu plus kolejne kroliki
        }
    }

    public int fibonacci(int n) {

        if (n == 0 || n == 1)
            return n;

        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }



        public int bunnyEars2(int bunnies) {

            if (bunnies == 0) {
                return 0;
            }
            else {
                if (bunnies % 2 == 0) {  // to jest warunek dla parzystego królika - jeżeli jest parzysty to dodajemy 3 i lecimy dalej - patrz niżej
                    return 3 + bunnyEars2(bunnies - 1);
                }
                else {                                          // doszlismy do tego momentu - jezeli nasz ktlik jest nie parzysty to dodamy 2.
                    return 2 + bunnyEars2(bunnies - 1);
                }
            }
        }




}