package com.rajat.exp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rajat.exp.model.CategoryEntity;
import com.rajat.exp.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {	
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public List<CategoryEntity> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@PostMapping
	public CategoryEntity addCategory(@RequestBody CategoryEntity categoryEntity) {
		return categoryService.addCategory(categoryEntity);
	}
	
	@GetMapping(value = "/{id}")
	public CategoryEntity getCategory(@PathVariable Integer id) {
		return categoryService.getCategory(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable Integer id){
		categoryService.deleteCategory(id);
		return ResponseEntity.ok().build();
	}
}
