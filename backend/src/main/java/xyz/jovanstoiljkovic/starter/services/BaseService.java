package xyz.jovanstoiljkovic.starter.services;

import java.lang.reflect.Field;
import java.util.Optional;

import xyz.jovanstoiljkovic.starter.models.BaseEntity;
import xyz.jovanstoiljkovic.starter.repositories.BaseRepository;

public abstract class BaseService<T extends BaseEntity> {

	BaseRepository<T> repo;

  public BaseService(BaseRepository<T> repo) {
    this.repo = repo;
  }
	public Iterable<T> findAll() {
		return repo.findAll();
	};

	public Optional<T> findById(Long id) {
		return repo.findById(id);
	}

	public Optional<T> create(T item) {
		T savedItem;
		savedItem = repo.save(item);

		if (savedItem == null)
			return Optional.empty();

		return Optional.of(savedItem);
	}

	public Optional<T> update(Long id, T item) {
		Optional<T> exist = this.findById(id);
		if (exist.isEmpty()) {
			return Optional.empty();
		}
		
		item.setId(id);

		T savedItem;
		savedItem = repo.save(item);

		if (savedItem == null)
			return Optional.empty();

		return Optional.of(savedItem);
	}

	public Optional<T> updatePatch(Long id, T item) {
	    return this.findById(id).map(existingEntity -> {
	        for (Field field : item.getClass().getDeclaredFields()) {
	        	// private field access
	            field.setAccessible(true);
	            try {
	                Object value = field.get(item);
	                if (value != null) {
	                    field.set(existingEntity, value);
	                }
	            } catch (IllegalAccessException e) {
	                throw new RuntimeException("Patch failed for field: " + field.getName(), e);
	            }
	        }
	        return repo.save(existingEntity);
	    });
	}

	public boolean delete(T item) {
		return this.deleteById(item.getId());
	}
  
  public boolean deleteById(Long id) {
		Optional<T> exist = this.findById(id);
		if (exist.isEmpty()) {
			return false;
		}
		repo.deleteById(id);
		return true;
	}

}
