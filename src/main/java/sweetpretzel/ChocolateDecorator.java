package sweetpretzel;

import java.math.BigDecimal;

public record ChocolateDecorator(Pretzel pretzel) implements Pretzel {

    private static final BigDecimal TOPPING_PRICE = new BigDecimal("0.70");
    private static final String TOPPING_NAME = "chocolate";
    private static final String AND = " and ";
    private static final String WITH = " with ";

    @Override
    public String name() {
        if (alreadyHasOneTopping()) {
            return pretzel.name() + AND + TOPPING_NAME;
        }
        return pretzel.name() + WITH + TOPPING_NAME;
    }

    @Override
    public BigDecimal price() {
        return pretzel.price().add(TOPPING_PRICE);
    }

    private boolean alreadyHasOneTopping() {
        return pretzel.name().contains(WITH);
    }
}
