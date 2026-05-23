package xyz.jovanstoiljkovic.starter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.jovanstoiljkovic.starter.dtos.food.FoodDTO;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodDTOLeaf;
import xyz.jovanstoiljkovic.starter.mappers.FoodMapper;
import xyz.jovanstoiljkovic.starter.models.Food;
import xyz.jovanstoiljkovic.starter.services.FoodService;

@RestController
@RequestMapping(value = { "/api/food" })
public class FoodController extends BaseController<Food, FoodDTO, FoodDTOLeaf, FoodMapper> {

    public FoodController(FoodService service, FoodMapper mapper) {
        super(service, mapper);
    }
}
