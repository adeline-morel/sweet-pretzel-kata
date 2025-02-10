package sweetpretzel;

import java.math.BigDecimal;

public abstract class ToppingDecorator implements Pretzel {

    protected Pretzel pretzel;
    protected BigDecimal toppingPrice;
    protected String toppingName;
    private static final String AND = " and ";
    private static final String WITH = " with ";

    ToppingDecorator(Pretzel pretzel, BigDecimal toppingPrice, String toppingName) {
        this.pretzel = pretzel;
        this.toppingPrice = toppingPrice;
        this.toppingName = toppingName;
    }

    @Override
    public String name() {
        if (alreadyHasOneTopping()) {
            return pretzel.name() + AND + toppingName;
        }
        return pretzel.name() + WITH + toppingName;
    }

    private boolean alreadyHasOneTopping() {
        return pretzel.name().contains(WITH);
    }

    @Override
    public String price() {
        return formattedPrice(calculatePrice());
    }

    @Override
    public BigDecimal calculatePrice() {
        return pretzel.calculatePrice().add(toppingPrice);
    }

    @Override
    public String formattedPrice(BigDecimal price) {
        return pretzel.formattedPrice(price);
    }
}
