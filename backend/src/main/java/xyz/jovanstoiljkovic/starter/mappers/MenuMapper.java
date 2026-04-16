package xyz.jovanstoiljkovic.starter.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import xyz.jovanstoiljkovic.starter.dtos.menu.MenuDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuDTOLeaf;
import xyz.jovanstoiljkovic.starter.models.Menu;

@Component
@Mapper(componentModel = "spring")
public abstract class MenuMapper extends BaseMapper<Menu, MenuDTO, MenuDTOLeaf> {

}