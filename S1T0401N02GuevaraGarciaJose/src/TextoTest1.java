import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

public class TextoTest1 {

    @Test
    public void verLongitud() {

        assertThat("Mordor", length(is(6)));

    }

    public static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "El tamaño de la cadena es:", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

}