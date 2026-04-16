package xyz.jovanstoiljkovic.starter.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import xyz.jovanstoiljkovic.starter.dtos.food.FoodRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodDTO;
import xyz.jovanstoiljkovic.starter.dtos.food.FoodDTOLeaf;
import xyz.jovanstoiljkovic.starter.models.Food;

@Component
@Mapper(componentModel = "spring", uses = { MenuMapper.class })
public abstract class FoodMapper extends BaseMapper<Food, FoodDTO, FoodDTOLeaf> {

}
