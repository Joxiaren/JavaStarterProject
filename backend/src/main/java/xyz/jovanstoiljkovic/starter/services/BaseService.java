package xyz.jovanstoiljkovic.starter.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import xyz.jovanstoiljkovic.starter.models.BaseEntity;

public abstract class BaseService<T extends BaseEntity> {

	@Autowired
	CrudRepository<T, Long> repo;

  public BaseService(CrudRepository<T, Long> repo) {
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

	public abstract Optional<T> updatePatch(Long id, T item);

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
