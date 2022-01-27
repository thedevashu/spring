package com.study.myinterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.entity.ProductEntity;

public interface MyProductRepositry extends JpaRepository<ProductEntity, Integer> {
	public ProductEntity getByName(String name);

	public ProductEntity getByCost(int cost);
}
