package com.rajat.exp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rajat.exp.model.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{}
