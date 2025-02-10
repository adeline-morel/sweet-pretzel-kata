package sweetpretzel;

import java.math.BigDecimal;

public class ChocolateDecorator extends ToppingDecorator {

    private static final BigDecimal PRICE = new BigDecimal("0.70");
    private static final String TOPPING_NAME = "chocolate";

    public ChocolateDecorator(Pretzel pretzel) {
        super(pretzel, PRICE, TOPPING_NAME);
    }
}
