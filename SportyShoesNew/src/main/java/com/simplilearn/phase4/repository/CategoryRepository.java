package com.simplilearn.phase4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.phase4.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
