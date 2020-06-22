package kr.ac.hansung.cse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity 
@NoArgsConstructor
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="product_id", nullable = false, updatable = false) 
	private int id;
	
	private String name;
	
	private String category;
	
	private int price;
	
	private String manufacturer;
	
	private int unitInStock;
	
	private String description;
	
}
