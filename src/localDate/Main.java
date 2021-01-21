package localDate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2017;
        int mont = 1;

        LocalDate myDate = LocalDate.of(year,mont,1);
        String dayOfWeek = String.valueOf(myDate.getDayOfWeek());

        LocalDate letsFindMonday = myDate;



        for (int i=0; i<7;i++){

            if (String.valueOf(letsFindMonday.getDayOfWeek()).equals("MONDAY")){
                break;
            }
           letsFindMonday= letsFindMonday.plusDays(1);

        }

        System.out.println(letsFindMonday);






    }
}
