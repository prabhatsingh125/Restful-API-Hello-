package com.example.hello.dao;

import com.example.hello.entity.Bicycle;
import org.springframework.data.repository.CrudRepository;

public interface BicycleRepository extends CrudRepository<Bicycle,Integer> {
}
