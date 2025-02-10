package sweetpretzel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;

public class Bundle {

    private final Collection<Pretzel> sweetPretzels;

    public Bundle(Collection<Pretzel> sweetPretzels) {
        this.sweetPretzels = sweetPretzels;
    }

    public BigDecimal price() {
        BigDecimal total = sweetPretzels.stream().map(Pretzel::price).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal discount = total.multiply(BigDecimal.valueOf(0.10));
        BigDecimal totalWithDiscount = total.subtract(discount);

        return totalWithDiscount.setScale(2, RoundingMode.HALF_UP);
    }
}
