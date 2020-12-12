public class booleans {

    public static void main(String[] args) {

        System.out.println("passed argumentrs: " + args);



    }
}

class robCos{

    public static void rob(boolean[] jakasTamTablica){
        int licznik=0;
        int licznikkk=33;
        for (int i=0;i<= jakasTamTablica.length-1;i++){
            jakasTamTablica[i]=!jakasTamTablica[i];
            System.out.println(++licznik);

        }

        System.out.println(++licznikkk);
    }
}
