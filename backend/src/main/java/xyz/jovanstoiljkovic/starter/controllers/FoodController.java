package xyz.jovanstoiljkovic.starter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.jovanstoiljkovic.starter.dtos.food.FoodRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodResponseDTO;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodResponseDTOLeaf;
import xyz.jovanstoiljkovic.starter.mappers.FoodMapper;
import xyz.jovanstoiljkovic.starter.models.Food;

@RestController
@RequestMapping(value = { "/api/food" })
public class FoodController extends BaseController<Food, FoodRequestDTO, FoodResponseDTO, FoodResponseDTOLeaf, FoodMapper> {

}
