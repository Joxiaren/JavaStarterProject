package xyz.jovanstoiljkovic.starter.repositories;

import org.springframework.stereotype.Repository;

import xyz.jovanstoiljkovic.starter.models.Category;

@Repository
public interface CategoryRepository extends BaseRepository<Category, Long> {

}
