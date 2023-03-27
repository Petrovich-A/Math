package by.petrovich.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MathTest {
    private final static Math MATH = new Math();

    @ParameterizedTest(name = "{index} ==> {1} + {2} = expected: {0}")
    @MethodSource("intProviderForSum")
    @DisplayName("Test: sum")
    void sum(int expected, int a, int b) {
        Assertions.assertEquals(expected, MATH.sum(a, b));
    }


    @ParameterizedTest(name = "{index} ==> {1} greater than {2} = expected: {0}")
    @MethodSource("intProviderForMax")
    @DisplayName("Test: max")
    void max(int expected, int a, int b) {
        Assertions.assertEquals(expected, MATH.max(a, b));
    }

    public static Stream<Arguments> intProviderForSum() {
        return Stream.of(Arguments.arguments(59, 45, 14),
                Arguments.arguments(5, -5, 10),
                Arguments.arguments(-1, Integer.MAX_VALUE, 1));
    }

    public static Stream<Arguments> intProviderForMax() {
        return Stream.of(Arguments.arguments(48, 3, 48),
                Arguments.arguments(94, 94, 2),
                Arguments.arguments(-5, -5, -10),
                Arguments.arguments(1, Integer.MAX_VALUE+1, 1));
    }
}