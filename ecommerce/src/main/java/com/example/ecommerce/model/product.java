package com.example.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "product")
@EntityListeners(AuditingEntityListener.class)
@EnableJpaAuditing
@JsonIgnoreProperties(value = {"created_at"}, allowGetters = true)
public class product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Product_id")
        private Long id;
    
    @Column(name="Product_name")
    private String productName;
    
    @Column(name="description")
    private String description;
    
    @Column(name="manufacturer")
    private String manufacturer;
    
    @Column(name = "seller")
    private String seller;
    
    @Column(name = "price")
    private Long price;
    
    @Column(name = "category_id")
    private Long category_id;
    
   @Column(name = "quantity")
   private Long quanity;
   
//   @Column(nullable = false, updatable = false)
//   @Temporal(TemporalType.TIMESTAMP)
//   @CreatedDate
//   private Date created_at;
   	@CreationTimestamp
   	private LocalDateTime created_at;
   
   //getters and setters
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getSeller() {
		return seller;
	}
	
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	public Long getPrice() {
		return price;
	}
	
	public void setPrice(Long price) {
		this.price = price;
	}
	
	public Long getCategory_id() {
		return category_id;
	}
	
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	
	public Long getQuanity() {
		return quanity;
	}
	
	public void setQuanity(Long quanity) {
		this.quanity = quanity;
	}
	
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	   
}
