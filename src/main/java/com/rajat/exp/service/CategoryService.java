package com.rajat.exp.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rajat.exp.model.CategoryEntity;
import com.rajat.exp.repository.CategoryRepository;

@Service
@Transactional
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<CategoryEntity> getAllCategories() {
		return categoryRepository.findAll();
	}
	
	public CategoryEntity addCategory(CategoryEntity categoryEntity) {
		return categoryRepository.save(categoryEntity);
	}
	
	public CategoryEntity getCategory(Integer id) {
		return categoryRepository.findById(id).get();		
	}
	
	public void deleteCategory(Integer id) {
		if(this.getCategory(id)!=null) {
			categoryRepository.deleteById(id);
		}
	}
	
//	public updateCategory(CategoryEntity categoryEntity) {
//		
//	}
	
}
