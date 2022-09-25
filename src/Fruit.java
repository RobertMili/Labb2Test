import java.util.Objects;

public class Fruit {
    private final String FruitProduct = "Fruit product";

    String name;
    int pris;
    int idkod;

    public Fruit(String name, int pris, int idkod) {
        this.name = name;
        this.pris = pris;
        this.idkod = idkod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getIdkod() {
        return idkod;
    }

    public void setIdkod(int idkod) {
        this.idkod = idkod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return pris == fruit.pris && idkod == fruit.idkod && Objects.equals(FruitProduct, fruit.FruitProduct) && Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FruitProduct, name, pris, idkod);
    }

    @Override
    public String toString() {
        return "\nProduct:" + "name= " + name + " pris= " + pris + " idkod= " + idkod + "\n";
    }
}
