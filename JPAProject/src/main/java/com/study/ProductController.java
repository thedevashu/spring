package com.study;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.study.ProductDao.ProductDao;
import com.study.entity.ProductEntity;

@RestController
@RequestMapping("/prod")
public class ProductController {
	@Autowired
	ProductDao pd;
	
	@GetMapping("/bycost/{cost}")
	public ProductEntity findByCost(@PathVariable int cost)
	{
		return pd.getByCost(cost);
	}
	
	@GetMapping("byname/{name}")
	public ProductEntity findProductByName(@PathVariable String name)
	{
		return pd.getByName(name);
	}
	
	@GetMapping("showAll")
	public List<ProductEntity> showAll(){
		return pd.showAll();
	}
	@PostMapping("/add")
	public void addProd(@RequestBody ProductEntity pe)
	{
		pd.addProduct(pe);
		System.out.println("DONE!!");
	}
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id)
	{
		pd.delete(id);
	}
	@PutMapping("cost/{id}/{cost}")
	public void updateCost(@PathVariable int id, @PathVariable int cost) {
		pd.update(id, cost);
	}
	@GetMapping("/getprod/{id}")
	public Optional<ProductEntity> findOne(@PathVariable int id)
	{
		System.out.println(id);
		return pd.showOne(id);
	}
}
