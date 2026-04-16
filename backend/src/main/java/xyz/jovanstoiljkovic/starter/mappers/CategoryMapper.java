package xyz.jovanstoiljkovic.starter.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import xyz.jovanstoiljkovic.starter.dtos.category.CategoryDTO;
import xyz.jovanstoiljkovic.starter.dtos.category.CategoryDTOLeaf;
import xyz.jovanstoiljkovic.starter.dtos.category.CategoryRequestDTO;
import xyz.jovanstoiljkovic.starter.models.Category;

@Component
@Mapper(componentModel = "spring", uses = { MenuMapper.class })
public abstract class CategoryMapper extends BaseMapper<Category, CategoryDTO, CategoryDTOLeaf> {

}