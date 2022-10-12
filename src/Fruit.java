public class Fruit extends Product {
    private final String FruitProduct = "Fruit product";

    public Fruit(String name, int pris, int EAN) {
        super(name, pris, EAN);
    }




    @Override
    public String toString() {
        return  super.getName()+ "     " + super.getPris() + "     "+ super.getEAN();
    }
}