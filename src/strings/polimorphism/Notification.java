package strings.polimorphism;

public class Notification {

    protected String msg;

    public Notification(String msg) {
        this.msg = msg;
    }

    public void show() {
        System.out.println(getMsg());
    }

    public String getMsg() {
        return msg;
    }



}

class Warning extends Notification {

    public Warning(String msg) {
        super(msg);
    }

    @Override
    public String getMsg() {
        return "WARN: " + msg;
    }
}

class Alarm extends Notification {

    public Alarm(String msg) {
        super(msg);
    }

    @Override
    public void show() {
        System.out.println("ALARM: " + msg);
    }
}


class Main {
    public static void main(String[] args) {


        Notification notif = new Notification("No problems");
        Notification warn = new Warning("Money ends");
        Notification alarm = new Alarm("The ship sank");

 //       warn.show();             //outputs "No problems" - niet
//        System.out.println(
        System.out.println(  alarm.getMsg()) ;//returns "ALARM: The ship sank"  da
//        System.out.println( warn.getMsg());         //returns "WARN: Money ends"
//       notif.show();         // outputs "No problems"  da
//       alarm.show();        //outputs "ALARM: The ship sank"da



        Person osoba = new Person("Ola",166);

        Patient pacjent = new Patient("Ewa",39, 123);


        System.out.println(osoba.toString());

        System.out.println();
        pacjent.toString();

       // Publication publikacja= new Publication("Don Stanislavo");
       // System.out.println(publikacja.getInfo());

        Newspaper newspaper = new Newspaper("CR7 w Juve", "sport.onet.pl");
        Article artykul = new Article("bunt kobiet","Kamil duroczok");
        Announcement Skoda = new Announcement("Sprzedam skode",15);

        Publication pNewspaper = new Newspaper("publikacja ala newspaper", "tvn24.pl");
       // System.out.println(pNewspaper.getInfo());
        System.out.println(pNewspaper.getInfo());
    }
}