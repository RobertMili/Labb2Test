import java.util.Objects;

public class Mejeriprodukter {
    private int pris;
    private String name;
    private int idkod;

    public Mejeriprodukter(String name, int pris, int idkod) {
        this.pris = pris;
        this.name = name;
        this.idkod = idkod;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdkod() {
        return idkod;
    }

    public void setIdkod(int idkod) {
        this.idkod = idkod;
    }
    public int size(int name){
        name++;
        return name;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "pris=" + pris +""+
                ", name='" + name + '\'' +
                ", idkod=" + idkod +"\n"+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mejeriprodukter product = (Mejeriprodukter) o;
        return pris == product.pris && idkod == product.idkod && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,pris, idkod);
    }
}
