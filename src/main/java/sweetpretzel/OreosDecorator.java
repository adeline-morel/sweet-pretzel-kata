package sweetpretzel;

import java.math.BigDecimal;

public class OreosDecorator extends ToppingDecorator {

    private static final BigDecimal PRICE = new BigDecimal("0.80");
    private static final String TOPPING_NAME = "oreos";

    public OreosDecorator(Pretzel pretzel) {
        super(pretzel, PRICE, TOPPING_NAME);
    }
}
