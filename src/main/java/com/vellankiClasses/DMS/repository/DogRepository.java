package com.vellankiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.vellankiClasses.DMS.models.Dog;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
List<Dog> findByName(String name);

}
