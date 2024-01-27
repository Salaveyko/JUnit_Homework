package com.itvdn.junit.labs.ex_005;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class ProviderTestData implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(-10, 15, 5),
                Arguments.of(-11, -12, -23)
        );
    }
}
