package enums;

public class JakasKlasa {
    public static void main(String[] args) {

        int counter =0;
        Secret Ola = Secret.STAR;

        for ( Secret cosik: Secret.values()
             ) {

            System.out.println(cosik.toString().substring(0,4));
            if (cosik.toString().substring(0,4).equals("STAR")){
                counter++;
            }

        }

        System.out.println(counter);



    }
}

enum Secret{
    STAR, NIESTAR,STARs, NIESTARsa,STARdsa, NIESTARs,STdAR, NIESTARdsd,STARaaa, NIESTARsss;
}
