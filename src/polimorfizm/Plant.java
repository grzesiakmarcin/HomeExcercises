package polimorfizm;

 class Plant {
   private String nazwa;

    public Plant(String nazwa) {
        this.nazwa = nazwa;
        System.out.println("Nowy Plant");
    }

    public void metodaPlant1(){
        System.out.println("Metoda nr 1 w Plant");
    }
    public void metodaPlant2(){
        System.out.println("Metoda nr 2 w Plant");
    }
}
