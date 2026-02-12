package xyz.jovanstoiljkovic.starter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import xyz.jovanstoiljkovic.starter.models.Food;

import java.util.List;
import java.util.Optional;

public abstract class BaseService<T> {

    @Autowired
    JpaRepository<T, Integer> repo;

    public List<T> findAll(){
        return repo.findAll();
    };
    public Optional<T> findById(int id){
        return repo.findById(id);
    }
    public Optional<T> create(T item){
        T savedItem;
        savedItem = repo.save(item);

        if(savedItem == null) return Optional.empty();

        return Optional.of(savedItem);
    }
    public Optional<T> update(int id, T item){
        T savedItem;
        savedItem = repo.save(item);

        if(savedItem == null) return Optional.empty();

        return Optional.of(savedItem);
    }
    public boolean delete(T item){
        repo.delete(item);
        return true;
    }
    public boolean deleteById(int id){
        repo.deleteById(id);
        return true;
    }
}
