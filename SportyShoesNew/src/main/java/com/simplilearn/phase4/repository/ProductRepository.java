package com.simplilearn.phase4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.phase4.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
