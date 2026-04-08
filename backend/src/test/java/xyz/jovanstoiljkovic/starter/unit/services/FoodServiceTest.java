package xyz.jovanstoiljkovic.starter.unit.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import xyz.jovanstoiljkovic.starter.models.Food;
import xyz.jovanstoiljkovic.starter.repositories.FoodRepository;
import xyz.jovanstoiljkovic.starter.services.FoodService;
import xyz.jovanstoiljkovic.starter.utility.datainit.FoodDataGenerator;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@DisplayName("FoodService Unit Test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class FoodServiceTest {

    private final FoodDataGenerator gen = new FoodDataGenerator();

    @Mock
    private FoodRepository repo;

    @InjectMocks
    private FoodService service;

    @Nested
    class UpdateTests {
        @Test
        void whenIdIsFound_returnUpdatedItem() {
            when(repo.findById(eq(10))).thenReturn(Optional.of(gen.generate()));
            Food item = gen.generate();

            Optional<Food> result = service.update(10, item);

            assertFalse(result.isEmpty());
            assertEquals(result.get().getName(), item.getName());
        }

        @Test
        void whenIdIsNotFound_returnEmptyOptional() {
            when(repo.findById(eq(11))).thenReturn(Optional.empty());
            Food item = gen.generate();

            Optional<Food> result = service.update(11, item);

            assert(result.isEmpty());
        }
    }
}