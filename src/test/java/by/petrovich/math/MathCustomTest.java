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
        Assertions.assertEquals(expected, MATH_CUSTOM.avg(array));
    }

    @ParameterizedTest(name = "{index} ==> max number of {1} = expected: {0}")
    @MethodSource("intProviderForMaxNumber")
    @DisplayName("Test: maxNumber")
    void maxNumber(int expected, int[] array) {
        Assertions.assertEquals(expected, MATH_CUSTOM.maxNumber(array));
    }

    @ParameterizedTest(name = "{index} ==> hypotenuse of {1}^2 + {2}^2 = expected: {0}")
    @MethodSource("intProviderForCalculateHypotenuse")
    @DisplayName("Test: calculateHypotenuse")
    void intProviderForCalculateHypotenuse(double expected, double a, double b) {
        Assertions.assertEquals(expected, MATH_CUSTOM.calculateHypotenuse(a, b));
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
                Arguments.arguments(22.33, new int[]{3, 16, 48}),
                Arguments.arguments(3, new int[]{8, -4, 5}),
                Arguments.arguments(0, new int[]{}));
    }

    public static Stream<Arguments> intProviderForMaxNumber() {
        return Stream.of(Arguments.arguments(3, new int[]{1, 2, 3}),
                Arguments.arguments(47, new int[]{47, 16, 4}),
                Arguments.arguments(16, new int[]{8, -4, 5, 16}),
                Arguments.arguments(0, new int[]{}));
    }

    public static Stream<Arguments> intProviderForCalculateHypotenuse() {
        return Stream.of(Arguments.arguments(3.61, 2, 3),
                Arguments.arguments(7.3, 4.38, 5.84),
                Arguments.arguments(1.43, 0.89, 1.12));
    }
}