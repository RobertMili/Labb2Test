import java.math.BigDecimal;

public class Receipt extends Product implements Discounter {

    public Receipt(String name, int pris, int idkod) {
        super(name, pris, idkod);
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}
