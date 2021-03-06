package com.study.myinterface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.entity.BookEntity;

public interface MyJPAInterface extends JpaRepository<BookEntity, Integer>{

	public List<BookEntity> findByBname(String bname);

	public void deleteByBname(String bname);
	

}
