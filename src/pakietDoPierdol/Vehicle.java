package pakietDoPierdol;

public class Vehicle {


        protected String regNumber;

        public String getRegNumber() {
            return regNumber;
        }

        public void setRegNumber(String regNumber) {
            this.regNumber = regNumber;
        }
    }

    class Car extends Vehicle {

        protected int numberOfSeats;

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }
    }

    class Start{
        public static void main(String[] args) {
            Vehicle car = new Car();


            car.setRegNumber("ABC-123"); // (2)
           // car.setNumberOfSeats(5); // (3)

            String regNumber = car.getRegNumber(); // (4)
           // int seats = car.getNumberOfSeats(); // (5)

            /*
             Vehicle car = new Car() - przy takiej deklaracji stworzylismy obiekt typu Vehicle który nie ma pojecia
             o polach i metodach klasy Car;
             */
        }
    }
