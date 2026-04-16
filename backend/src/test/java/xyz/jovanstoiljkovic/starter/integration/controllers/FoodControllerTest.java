package xyz.jovanstoiljkovic.starter.integration.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import xyz.jovanstoiljkovic.starter.controllers.FoodController;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodDTO;
import xyz.jovanstoiljkovic.starter.mappers.FoodMapper;
import xyz.jovanstoiljkovic.starter.models.Food;
import xyz.jovanstoiljkovic.starter.services.FoodService;
import xyz.jovanstoiljkovic.starter.utility.datainit.FoodDataGenerator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@DisplayName("FoodController Integration Test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class FoodControllerTest {

    @Autowired
    private FoodDataGenerator dataGen;

    @Autowired
    private FoodMapper mapper;

    @MockitoBean
    private FoodService service;

    @Autowired
    private FoodController controller;

    @Nested
    class FindAll{
        @Test
        void findAll_whenServiceHasItems_returnItemDTOs() {
            List<Food> foodList = dataGen.generateMany(5);
            when(service.findAll()).thenReturn(foodList);

            List<FoodDTO> result = controller.findAll();

            assertEquals(foodList.size(), result.size());

            for (int j = 0; j < foodList.size(); j++) {
                assertEquals(foodList.get(j).getName(), result.get(j).getName());
            }
        }

        @Test
        void findAll_whenServiceIsEmpty_returnEmptyList() {
            List<Food> foodList = List.of();
            when(service.findAll()).thenReturn(foodList);

            List<FoodDTO> result = controller.findAll();

            assertEquals(0, result.size());
        }
    }

    @Test
    void findById() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}