package xyz.jovanstoiljkovic.starter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.jovanstoiljkovic.starter.dtos.requests.FoodRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.responses.FoodResponseDTO;
import xyz.jovanstoiljkovic.starter.mappers.FoodMapper;
import xyz.jovanstoiljkovic.starter.models.Food;
import xyz.jovanstoiljkovic.starter.services.BaseService;

@RestController
@RequestMapping(value={"/api/food/"})
public class FoodController extends BaseController<Food, FoodRequestDTO, FoodResponseDTO, FoodMapper>{

    public FoodController(BaseService<Food> service, FoodMapper mapper) {
        super(service, mapper);
    }
}
