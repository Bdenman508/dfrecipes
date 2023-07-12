package com.dfrecipes.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Recipes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="recipe_number")
	private int rNo;
	@Column(name="recipe_name")
	private String rName;
	@Column(name="recipe_description")
	private String rDesc;
	@Column(name="recipe_type")
	private String rType;
	
	
	public int getrNo() {
		return rNo;
	}
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getrDesc() {
		return rDesc;
	}
	public void setrDesc(String rDesc) {
		this.rDesc = rDesc;
	}
	public String getrType() {
		return rType;
	}
	public void setrType(String rType) {
		this.rType = rType;
	}
	
	public Recipes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recipes(int rNo, String rName, String rDesc, String rType) {
		super();
		this.rNo = rNo;
		this.rName = rName;
		this.rDesc = rDesc;
		this.rType = rType;
	}
	@Override
	public String toString() {
		return "Recipes [rNo=" + rNo + ", rName=" + rName + ", rDesc=" + rDesc + ", rType=" + rType + "]";
	}
	
}
