package xyz.jovanstoiljkovic.starter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.jovanstoiljkovic.starter.dtos.category.CategoryDTOLeaf;
import xyz.jovanstoiljkovic.starter.dtos.category.CategoryRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.category.CategoryDTO;
import xyz.jovanstoiljkovic.starter.mappers.CategoryMapper;
import xyz.jovanstoiljkovic.starter.models.Category;
import xyz.jovanstoiljkovic.starter.services.BaseService;

@RestController
@RequestMapping(value = { "/api/category" })
public class CategoryController extends BaseController<Category, CategoryDTO, CategoryDTOLeaf, CategoryMapper> {

    public CategoryController(BaseService<Category> service, CategoryMapper mapper) {
        super(service, mapper);
    }
}
