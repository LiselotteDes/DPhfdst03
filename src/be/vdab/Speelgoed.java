package be.vdab;
import java.math.BigDecimal;
public abstract class Speelgoed {
    private final BigDecimal prijs;
    public Speelgoed(BigDecimal prijs) {
        this.prijs = prijs;
    }
    public BigDecimal getPrijs() {
        return prijs;
    }
}
