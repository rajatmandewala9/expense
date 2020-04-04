package com.rajat.exp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Table(name = "category")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryEntity implements Serializable {
	
	private static final long serialVersionUID = 6815028546605769472L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;	

	private String category;
	
	private String description;
}
