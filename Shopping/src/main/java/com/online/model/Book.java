package com.online.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
public class Book {

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
	private Date creataddate;
	
	@Column(name="date_updated")
	private Date updateddate;
	
	
	
	
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private BookCategory category;
	
	
	
	
}
