package sweetpretzel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SweetPretzelTest {

    @DisplayName("should display toppings and price")
    @ParameterizedTest(name = "{index} => pretzel={0}, expectedName={1}, expectedPrice={2}")
    @MethodSource("provideSweetPretzels")
    void shouldDisplayToppingsAndPrice(Pretzel pretzel, String expectedName, String expectedPrice) {
        Assertions.assertThat(pretzel.name()).isEqualTo(expectedName);
        Assertions.assertThat(pretzel.price()).isEqualTo(expectedPrice);
    }

    private static Stream<Arguments> provideSweetPretzels() {
        return Stream.of(
                Arguments.of(new SweetPretzel(), "Sweet pretzel", "$2.50"),
                Arguments.of(new ChocolateDecorator(new SweetPretzel()), "Sweet pretzel with chocolate", "$3.20"),
                Arguments.of(new OreosDecorator(new SweetPretzel()), "Sweet pretzel with oreos", "$3.30"),
                Arguments.of(new ChocolateDecorator(new OreosDecorator(new SweetPretzel())), "Sweet pretzel with oreos and chocolate", "$4.00"),
                Arguments.of(new OreosDecorator(new ChocolateDecorator(new SweetPretzel())), "Sweet pretzel with chocolate and oreos", "$4.00")
        );
    }
}
