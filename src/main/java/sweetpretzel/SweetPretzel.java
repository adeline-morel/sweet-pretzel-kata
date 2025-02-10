package sweetpretzel;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class SweetPretzel implements Pretzel {

    private static final BigDecimal BASE_PRICE = new BigDecimal("2.50");
    private static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);

    @Override
    public String name() {
        return "Sweet pretzel";
    }

    @Override
    public String price() {
        return formattedPrice(BASE_PRICE);
    }

    @Override
    public BigDecimal calculatePrice() {
        return BASE_PRICE;
    }

    @Override
    public String formattedPrice(BigDecimal price) {
        return CURRENCY_FORMAT.format(price);
    }
}
