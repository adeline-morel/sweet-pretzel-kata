package sweetpretzel;

import java.math.BigDecimal;

public interface Pretzel {
    String name();
    String price();
    BigDecimal calculatePrice();
    String formattedPrice(BigDecimal price);
}
