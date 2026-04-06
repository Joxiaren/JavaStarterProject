package xyz.jovanstoiljkovic.starter.unit.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.jovanstoiljkovic.starter.controllers.FoodController;
import xyz.jovanstoiljkovic.starter.dtos.responses.FoodResponseDTO;
import xyz.jovanstoiljkovic.starter.mappers.FoodMapper;
import xyz.jovanstoiljkovic.starter.models.Food;
import xyz.jovanstoiljkovic.starter.services.FoodService;
import xyz.jovanstoiljkovic.starter.utility.datainit.FoodDataGenerator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest()
@ExtendWith(MockitoExtension.class)
class FoodControllerTest {

    @Mock
    private FoodService service;

    @Autowired
    private static FoodDataGenerator dataGen;

    @Autowired
    private static FoodMapper mapper;

    @InjectMocks
    private FoodController controller;

    @BeforeAll
    public void beforeAll(){
        //TODO: check why @Autowired and @SpyBean dont work on MapStruct
        mapper = Mappers.getMapper(FoodMapper.class);
    }
    @Test
    void findAll_whenServiceHasItems_ReturnItemDTOs() {
        List<Food> foodList = dataGen.generateMany(5);
        when(service.findAll()).thenReturn(foodList);

        List<FoodResponseDTO> result =  controller.findAll();

        assertEquals(foodList.size(), result.size());

        for (int j = 0; j < foodList.size(); j++){
            assertEquals(foodList.get(j).getName(), result.get(j).getName());
        }
    }

    @Test
    void findAll_whenServiceIsEmpty_returnEmptyList(){
        List<Food> foodList = List.of();
        when(service.findAll()).thenReturn(foodList);

        List<FoodResponseDTO> result = controller.findAll();

        assertEquals(0, result.size());
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