package by.petrovich.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MathCustomTest {
    private final static MathCustom MATH_CUSTOM = new MathCustom();

    @ParameterizedTest(name = "{index} ==> {1} + {2} = expected: {0}")
    @MethodSource("intProviderForSum")
    @DisplayName("Test: sum")
    void sum(int expected, int a, int b) {
        Assertions.assertEquals(expected, MATH_CUSTOM.sum(a, b));
    }


    @ParameterizedTest(name = "{index} ==> {1} greater than {2} = expected: {0}")
    @MethodSource("intProviderForMax")
    @DisplayName("Test: max")
    void max(int expected, int a, int b) {
        Assertions.assertEquals(expected, MATH_CUSTOM.max(a, b));
    }

    @ParameterizedTest(name = "{index} ==> avg of {1} = expected: {0}")
    @MethodSource("intProviderForAvg")
    @DisplayName("Test: avg")
    void avg(double expected, int[] array) {
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
                Arguments.arguments(1, Integer.MAX_VALUE + 1, 1));
    }

    public static Stream<Arguments> intProviderForAvg() {
        return Stream.of(Arguments.arguments(2, new int[]{1, 2, 3}),
                Arguments.arguments(22.33, new int[]{3, 16, 48}));
    }
}