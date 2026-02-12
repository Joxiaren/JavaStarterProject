package xyz.jovanstoiljkovic.starter.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import xyz.jovanstoiljkovic.starter.dtos.requests.FoodRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.responses.FoodResponseDTO;
import xyz.jovanstoiljkovic.starter.models.Food;

@Component
@Mapper(componentModel = "spring")
public abstract class FoodMapper extends BaseMapper<Food, FoodRequestDTO, FoodResponseDTO>{

}
