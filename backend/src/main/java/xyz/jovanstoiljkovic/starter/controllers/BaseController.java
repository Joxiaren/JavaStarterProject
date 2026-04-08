package xyz.jovanstoiljkovic.starter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.mappers.BaseMapper;
import xyz.jovanstoiljkovic.starter.services.BaseService;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseController<
        T,
        RequestDTO extends BaseDTO<T>,
        ResponseDTO extends BaseDTO<T>,
        Mapper extends BaseMapper<T, RequestDTO, ResponseDTO>
> {

    BaseService<T> service;
    Mapper mapper;

    public BaseController(BaseService<T> service, Mapper mapper){
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<ResponseDTO> findAll(){
        List<ResponseDTO> result = new ArrayList<>();
        service.findAll().forEach(item-> result.add(mapper.entityToResponse(item)));
        return result;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> findById(@PathVariable int id){
        return service.findById(id)
                .map(item -> ResponseEntity.ok(mapper.entityToResponse(item)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> create(@RequestBody RequestDTO item){
        return service.create(mapper.requestToEntity(item))
                .map(itemT -> ResponseEntity.ok(mapper.entityToResponse(itemT)))
                .orElse(ResponseEntity.badRequest().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDTO> update(@PathVariable int id, @RequestBody RequestDTO item){
        return service.update(id, mapper.requestToEntity(item))
                .map(itemT -> ResponseEntity.ok(mapper.entityToResponse(itemT)))
                .orElse(ResponseEntity.badRequest().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
