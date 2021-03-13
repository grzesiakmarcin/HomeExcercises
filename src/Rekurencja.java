public class Rekurencja {
    public static void main(String[] args) {

        Rekurencja r= new Rekurencja();

        int liczba=5;
        int result=r.metodaRekurencyjna(liczba);

        System.out.println("silnia z "+liczba+" wynosi: "+result);



    }

    public int metodaRekurencyjna(int cyfra){
        if(cyfra==1){
            return 1;
        }
        else {
            return cyfra * metodaRekurencyjna(cyfra - 1);
        }
    }

}
