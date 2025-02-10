package sweetpretzel;

import java.math.BigDecimal;

public record SweetPretzel(BigDecimal price) implements Pretzel {
    @Override
    public String name() {
        return "Sweet pretzel";
    }
}
