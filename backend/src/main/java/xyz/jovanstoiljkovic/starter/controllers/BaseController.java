package xyz.jovanstoiljkovic.starter.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;
import xyz.jovanstoiljkovic.starter.mappers.BaseMapper;
import xyz.jovanstoiljkovic.starter.models.BaseEntity;
import xyz.jovanstoiljkovic.starter.services.BaseService;

public abstract class BaseController<
		T extends BaseEntity,
		DTO extends BaseDTO<T>,
		DTOLeaf extends BaseDTO<T>,
		Mapper extends BaseMapper<T, DTO, DTOLeaf>
> {

    BaseService<T> service;
    Mapper mapper;

    public BaseController(BaseService<T> service, Mapper mapper){
        this.service = service;
        this.mapper = mapper;
    }
	@GetMapping
	public List<DTO> findAll() {

		List<DTO> result = new ArrayList<>();
		service.findAll().forEach(item -> result.add(mapper.entityToDTO(item)));
		return result;
	}

	@GetMapping("/{id}")
	public ResponseEntity<DTO> findById(@PathVariable Long id) {
		return service.findById(id).map(item -> ResponseEntity.ok(mapper.entityToDTO(item)))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<DTO> create(@RequestBody DTO item) {
		return service.create(mapper.DTOToEntity(item))
				.map(itemT -> ResponseEntity.ok(mapper.entityToDTO(itemT)))
				.orElse(ResponseEntity.badRequest().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<DTO> updatePut(@PathVariable  Long id, @RequestBody DTO item) {
		return service.update(id, mapper.DTOToEntity(item))
				.map(itemT -> ResponseEntity.ok(mapper.entityToDTO(itemT)))
				.orElse(ResponseEntity.badRequest().build());
	}

	@PatchMapping("/{id}")
	public ResponseEntity<DTO> updatePatch(@PathVariable Long id, @RequestBody DTO item) {
		return service.updatePatch(id, mapper.DTOToEntity(item))
				.map(itemT -> ResponseEntity.ok(mapper.entityToDTO(itemT)))
				.orElse(ResponseEntity.badRequest().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
