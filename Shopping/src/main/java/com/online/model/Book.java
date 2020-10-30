package com.online.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter 
@Setter
@Entity
@Table(name="tbl_book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String sku;
	
	@Column(name="image_url")
	private String imageurl;
	
	private String description;
	
	@Column(name="unit_price")
	private BigDecimal unitprice;
	
	private Boolean active;
	
	@Column(name="unit_stock")
	private int unitstock;
	
	
	@Column(name="date_created") 
	private Date createddate;
	  
	@Column(name="date_updated")
	private Date updateddate;
	 
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private BookCategory category;
	
	
	
	
}
