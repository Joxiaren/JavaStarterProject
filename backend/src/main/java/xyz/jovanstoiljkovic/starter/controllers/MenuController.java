package xyz.jovanstoiljkovic.starter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.jovanstoiljkovic.starter.dtos.menu.MenuRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuDTOLeaf;
import xyz.jovanstoiljkovic.starter.mappers.MenuMapper;
import xyz.jovanstoiljkovic.starter.models.Menu;
import xyz.jovanstoiljkovic.starter.services.BaseService;

@RestController
@RequestMapping(value = { "/api/menu" })
public class MenuController extends BaseController<Menu, MenuDTO, MenuDTOLeaf, MenuMapper> {

    public MenuController(BaseService<Menu> service, MenuMapper mapper) {
        super(service, mapper);
    }
}
