package codingBat;

public class Strings {
    public static void main(String[] args) {

        String sub = "fig";
        String str = "abc";
        String out = "[[]]";

        StringOne s1 = new StringOne();

        s1.middleThree(str);

        s1.hasBad(str);


        System.out.println(sub.substring(0, 1));

        System.out.println(s1.fizzString(sub));


    }

}


class StringOne {

    public String makeOutWord(String out, String str) {
        System.out.println(out.substring(0, 2) + str + out.substring(2, 4));

        return out;
    }

    public String firstTwo(String str) {

        if (str.length() < 3) {
            return str;
        } else {
            return str.substring(0, 2);
        }

    }

    public String firstHalf(String str) {
        int lenght = str.length() / 2;

        return str.substring(0, lenght);
    }

    public String withoutEnd(String str) {
        return str.substring(0 + 1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public String left2(String str) {

        if (str.length() > 2) {
            return str.substring(2, str.length()) + str.substring(0, 2);
        }
        return str;

    }


    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1, str.length());
    }

    public String withouEnd2(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        }
        return "";
    }


    public String middleTwo(String str) {
        int wordLength = str.length() / 2;

        if (str.length() > 2) {
            return str.substring(wordLength - 1, wordLength + 1);

        }
        return str;
    }


    public boolean endsLy(String str) {

        if (str.length() >= 2 && str.substring(str.length() - 2).equals("ly")) {
            System.out.println("true");
            return true;
        }
        System.out.println("false " + str.substring(str.length() - 2));
        return false;
    }


    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);


    }


    public String twoChar(String str, int index) {

        if (index > 0) {

            if (str.length() > index + 1)

                return str.substring(index, index + 2);

            else
                return str.substring(0, 2);
        } else
            return str.substring(0, 2);
    }

    public String middleThree(String str) {
        int len = (int) str.length() / 2;
        return str.substring(len - 1, len + 2);


    }

    public boolean hasBad(String str) {
        if (str.length() > 3) {

            if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
                return true;
            }

            return false;
        } else if (str.length() == 3) {

            if (str.substring(0, 3).equals("bad")) {
                return true;
            }

            return false;
        }


        return false;
    }

    public String atFirst(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        } else if (str.length() == 2) {
            return str;
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }

    }

    public String lastChars(String a, String b) {

        if (a.length() > 0 && b.length() > 0) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        } else if (a.length() == 0 && b.length() > 0) {
            return "@" + b.substring(b.length() - 1);
        } else if (a.length() > 0 && b.length() == 0) {
            return a.substring(0, 1) + "@";
        }


        return "@@";

    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        } else if ((a.charAt(a.length() - 1) == b.charAt(0))) {
            return a.substring(0, a.length() - 1) + b;
        }

        return a + b;
    }


    public String fizzString(String str) {
        String fLetter = "f";

        if (str.substring(0, 1).equals("f")) {

            if (str.substring(str.length() - 1, str.length()).equals("b")) {
                return "FizzBuzz";
            }

            return "Fizz";
        } else if (str.substring(str.length() - 1, str.length()).equals("b")) {
            return "Buzz";

        }
        return str;
    }


    public String fizzString2(int n) {

        if (n % 3 == 0) {

            if (n % 5 == 0) {
                return "FizzBuzz!";
            }
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        }
        return String.valueOf(n) + "!";


    }

    public boolean twoAsOne(int a, int b, int c) {

        if (a + b == c || b + c == a || a + c == b) {

            return true;

        }

        return false;

    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (c > b) {

            if (bOk = true) {
                return true;
            } // cos tu sie wykrzacza w testach - warunek 324 false nie przechodzi
            else if (b > a) {
                return true;
            }
            return false;
        }
        return false;


    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk = false && a < b && b < c) {
            return true;
        } else if (equalOk = true && a <= b && b <= c) {
            return true;
        } // cos sie wykrzacza

        return false;
    }


    public boolean lastDigit(int a, int b, int c) {
        String numberA = String.valueOf(a);
        String numberB = String.valueOf(b);
        String numberC = String.valueOf(c);

        if ((numberA.substring(numberA.length() - 1).equals(numberB.length() - 1)) || numberA.substring(numberA.length() - 1).equals(numberC.length() - 1) || numberB.substring(numberA.length() - 1).equals(numberC.length() - 1)) {
            return true;
        }
        return false;
    }

    //to jest glupie - nie robie w pojedynke


    public void metodka(int[] tab) {


        for (int i = 0; i < tab.length-1; i++) {

            if(tab[i]%2==0){



                System.out.println(tab[i]+ "jest liczbą parzystą");
                continue;

            }


            }
        }








    }


