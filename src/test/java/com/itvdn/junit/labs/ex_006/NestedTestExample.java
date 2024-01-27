package com.itvdn.junit.labs.ex_006;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NestedTestExample {

    @Nested
    class checkAgeOfPerson {

        @ParameterizedTest
        @ArgumentsSource(PersonProvider.class)
        void checkAgeGraterThan18(Person person) {
            assertTrue(person.getAge() >= 18);
        }
    }

    @Nested
    class checkNameOfPerson {

        @ParameterizedTest
        @ArgumentsSource(PersonProvider.class)
        void checkFirstnameLengthMoreThan4(Person person) {
            assertTrue(person.getFirstName().length() >= 4);
        }
    }

    static class PersonProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    new Person("Tania", "Solovey", 31),
                    new Person("Kristina", "Solovey", 20),
                    new Person("Sofia", "Solovey", 18)
            ).map(Arguments::of);
        }
    }
}
