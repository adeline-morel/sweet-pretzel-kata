package sweetpretzel;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SweetPretzelTest {
    @Test
    void shouldCost2DollarsAnd50CentsForSweetPretzelWithoutTopping() {
        assertThat(new SweetPretzel().amount()).isEqualTo("2.50$");
    }
}
