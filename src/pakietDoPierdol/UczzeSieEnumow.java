package pakietDoPierdol;

public enum UczzeSieEnumow {
    CALM{
        public String format(String message) {
            System.out.println( "Here is your message: " + message);
            return "";
        }
    },
    NERVOUS {
        public String format(String message) {

            return "ARGH! STOP BOTHERING ME WITH YOUR MESSAGE! " + message + " I'M NOT GOING TO ACCEPT ANYTHING MORE!";
        }
    };


    public abstract String format (String message);

}
