package com.itvdn.junit.labs.ex_005;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafeAdditionUtilTest {
    private SafeAdditionUtil util = new SafeAdditionUtil();

    @ParameterizedTest
    @ArgumentsSource(ProviderTestData.class)
    void whenWithAnnotationArgumentSourceParams_thenSafeAdd(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }

    @ParameterizedTest
    @MethodSource
    void whenWithAnnotationMethodSourceParams_thenSafeAdd(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/Parameters.csv")
    void whenWithAnnotationFileSourceParams_thenSafeAdd(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "-11, 33, 22",
            "-1, -5, -6"
    })
    void whenWithAnnotationSourceParams_thenSafeAdd(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }

    private static Stream<Arguments> whenWithAnnotationMethodSourceParams_thenSafeAdd() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(132, -32, 100),
                Arguments.of(Integer.MAX_VALUE, 2, Integer.MAX_VALUE),
                Arguments.of(Integer.MIN_VALUE, -2, Integer.MIN_VALUE)
        );
    }
}