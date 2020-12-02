

class ConcatenateStrings {

    public static String concatenateStringsWithoutDigits(String[] strings) {

        for (String cosik:strings
        ) {

            System.out.println(cosik);


        }



        StringBuilder stringBuilder= new StringBuilder();



        return stringBuilder.toString();


    }

    public static void main(String[] args) {

        String[] strings = {"A","B","1","C"};
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);

    }
}