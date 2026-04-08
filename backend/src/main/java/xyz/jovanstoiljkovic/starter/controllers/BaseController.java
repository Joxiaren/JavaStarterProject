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
		RequestDTO extends BaseDTO<T>,
		ResponseDTO extends BaseDTO<T>,
		ResponseDTOLeaf extends BaseDTO<T>,
		Mapper extends BaseMapper<T, RequestDTO, ResponseDTO, ResponseDTOLeaf>
> {

    BaseService<T> service;
    Mapper mapper;

    public BaseController(BaseService<T> service, Mapper mapper){
        this.service = service;
        this.mapper = mapper;
    }
	@GetMapping
	public List<ResponseDTO> findAll() {

		List<ResponseDTO> result = new ArrayList<>();
		service.findAll().forEach(item -> result.add(mapper.entityToResponse(item)));
		return result;
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseDTO> findById(@PathVariable Long id) {
		return service.findById(id).map(item -> ResponseEntity.ok(mapper.entityToResponse(item)))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<ResponseDTO> create(@RequestBody RequestDTO item) {
		return service.create(mapper.requestToEntity(item))
				.map(itemT -> ResponseEntity.ok(mapper.entityToResponse(itemT)))
				.orElse(ResponseEntity.badRequest().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<ResponseDTO> updatePut(@PathVariable  Long id, @RequestBody RequestDTO item) {
		return service.update(id, mapper.requestToEntity(item))
				.map(itemT -> ResponseEntity.ok(mapper.entityToResponse(itemT)))
				.orElse(ResponseEntity.badRequest().build());
	}

	@PatchMapping("/{id}")
	public ResponseEntity<ResponseDTO> updatePatch(@PathVariable Long id, @RequestBody RequestDTO item) {
		return service.updatePatch(id, mapper.requestToEntity(item))
				.map(itemT -> ResponseEntity.ok(mapper.entityToResponse(itemT)))
				.orElse(ResponseEntity.badRequest().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
