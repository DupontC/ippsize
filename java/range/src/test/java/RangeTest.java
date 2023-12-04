
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RangeTest {
    @Test
    void should_concat_two_string(){
        // GIVE
        String helloWorld = "Hello World";

        // WHEN
        String res = helloWorld.concat("!");

        // THEN
        assertThat(res).isEqualTo("Hello World!");

    }
}
