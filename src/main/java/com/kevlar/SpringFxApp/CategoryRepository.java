package com.kevlar.SpringFxApp;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer>
{
        @Override
	Category save(Category category);
	Optional<Category> findById(int id);
        @Override
	List<Category> findAll();
	boolean existsById(int id);
	//long count();
	
	List<Category> findByName(String name);
	List<Category> findByVisible(boolean visible);
}
