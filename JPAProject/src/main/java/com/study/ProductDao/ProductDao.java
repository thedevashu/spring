package com.study.ProductDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.entity.ProductEntity;
import com.study.myinterface.MyProductRepositry;

@Service
public class ProductDao {


	@Autowired
	MyProductRepositry repo;
	
	public void addProduct(ProductEntity pe) {
		repo.save(pe);
	}
	
	public List<ProductEntity> showAll(){
		return repo.findAll();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
		System.out.println("DELETE DONE!!");
	}
	
	public void update(int id,int cost) {
		ProductEntity p =repo.getById(id);
		p.setCost(cost);
		repo.save(p);
	}
	
	public Optional<ProductEntity> showOne(int pid) {
		System.out.println(pid+"--\n\n\n\n");
//		ProductEntity p = repo.getById(pid);
		Optional<ProductEntity> p= repo.findById(pid);
		System.out.println(p);
		
//		return repo.find(ProductEntity.class,pid);
		return p;
	}

	public ProductEntity getByName(String name) {
		// TODO Auto-generated method stub
		return repo.getByName(name);
	}

	public ProductEntity getByCost(int cost) {
		// TODO Auto-generated method stub
		return repo.getByCost(cost);
	}
}
