package sweetpretzel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class SweetPretzelTest {

    @DisplayName("should display toppings and price")
    @ParameterizedTest(name = "{index} => pretzel={0}, expectedName={1}, expectedPrice={2}")
    @MethodSource("provideSweetPretzels")
    void shouldDisplayToppingsAndPrice(Pretzel pretzel, String expectedName, BigDecimal expectedPrice) {
        assertThat(pretzel.name()).isEqualTo(expectedName);
        assertThat(pretzel.price()).isEqualTo(expectedPrice);
    }

    private static Stream<Arguments> provideSweetPretzels() {
        SweetPretzel sweetPretzel = new SweetPretzel(new BigDecimal("2.50"));
        OreosDecorator oreosPretzel = new OreosDecorator(sweetPretzel);
        ChocolateDecorator chocolatePretzel = new ChocolateDecorator(sweetPretzel);

        return Stream.of(
                Arguments.of(sweetPretzel, "Sweet pretzel", new BigDecimal("2.50")),
                Arguments.of(chocolatePretzel, "Sweet pretzel with chocolate", new BigDecimal("3.20")),
                Arguments.of(oreosPretzel, "Sweet pretzel with oreos", new BigDecimal("3.30")),
                Arguments.of(new ChocolateDecorator(oreosPretzel), "Sweet pretzel with oreos and chocolate", new BigDecimal("4.00")),
                Arguments.of(new OreosDecorator(chocolatePretzel), "Sweet pretzel with chocolate and oreos", new BigDecimal("4.00"))
        );
    }

    @DisplayName("should apply 10% discount for bundle of non fresh pretzels")
    @ParameterizedTest(name = "{index} => bundle={0}, expectedPrice={1}")
    @MethodSource("provideBundles")
    void shouldBe10percentDiscountForBundle(Bundle bundle, BigDecimal expectedPrice) {
        assertThat(bundle.price()).isEqualTo(expectedPrice);
    }

    private static Stream<Arguments> provideBundles() {
        SweetPretzel sweetPretzel = new SweetPretzel(new BigDecimal("2.50"));
        ChocolateDecorator chocolatePretzel = new ChocolateDecorator(sweetPretzel);

        Bundle bundleWithTwoSweetPretzels = new Bundle(List.of(sweetPretzel, sweetPretzel));
        Bundle bundleWithOneSweetPretzelsAndOneChocolatePretzel = new Bundle(List.of(sweetPretzel, chocolatePretzel));

        return Stream.of(
                Arguments.of(bundleWithTwoSweetPretzels, new BigDecimal("4.50")),
                Arguments.of(bundleWithOneSweetPretzelsAndOneChocolatePretzel, new BigDecimal("5.13"))
        );
    }
}
