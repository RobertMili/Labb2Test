public class Meat extends Product {
    private final String FruitProduct = "Kött product";

    public Meat(String name, int pris, int EAN) {
        super(name, pris, EAN);
    }


    @Override
    public String toString() {
        return super.getName()+ "       " + super.getPris() + "     "+ super.getEAN();
    }
}
