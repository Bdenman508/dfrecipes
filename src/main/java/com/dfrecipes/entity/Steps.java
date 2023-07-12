package com.dfrecipes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Steps")
public class Steps {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "stepsNo")
	private int stepsNo;
	@Column(name = "stepsDesc")
	private String stepsDesc;
	
	
	public int getStepsNo() {
		return stepsNo;
	}
	public void setStepsNo(int stepsNo) {
		this.stepsNo = stepsNo;
	}
	public String getStepsDesc() {
		return stepsDesc;
	}
	public void setStepsDesc(String stepsDesc) {
		this.stepsDesc = stepsDesc;
	}
	public Steps() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Steps(int stepsNo, String stepsDesc) {
		super();
		this.stepsNo = stepsNo;
		this.stepsDesc = stepsDesc;
	}
	@Override
	public String toString() {
		return "Steps [stepsNo=" + stepsNo + ", stepsDesc=" + stepsDesc + "]";
	}
	
	
}
