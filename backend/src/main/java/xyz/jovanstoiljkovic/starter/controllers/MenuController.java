package xyz.jovanstoiljkovic.starter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.jovanstoiljkovic.starter.dtos.menu.MenuRequestDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuResponseDTO;
import xyz.jovanstoiljkovic.starter.dtos.menu.MenuResponseDTOLeaf;
import xyz.jovanstoiljkovic.starter.mappers.MenuMapper;
import xyz.jovanstoiljkovic.starter.models.Menu;

@RestController
@RequestMapping(value = { "/api/menu" })
public class MenuController extends BaseController<Menu, MenuRequestDTO, MenuResponseDTO, MenuResponseDTOLeaf, MenuMapper> {

}
