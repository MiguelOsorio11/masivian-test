package com.masivian.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculators")
public class Calculator implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "value_add")
	private Integer valueFunctionAdd;

	@Column(name = "value_substract")
	private Integer valueFunctionSubstract;

	@Column(name = "value_divide")
	private Integer valueFunctionDivide;

	@Column(name = "value_multiply")
	private Integer valueFunctionMultiply;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getValueFunctionAdd() {
		return valueFunctionAdd;
	}

	public void setValueFunctionAdd(Integer valueFunctionAdd) {
		this.valueFunctionAdd = valueFunctionAdd;
	}

	public Integer getValueFunctionSubstract() {
		return valueFunctionSubstract;
	}

	public void setValueFunctionSubstract(Integer valueFunctionSubstract) {
		this.valueFunctionSubstract = valueFunctionSubstract;
	}

	public Integer getValueFunctionDivide() {
		return valueFunctionDivide;
	}

	public void setValueFunctionDivide(Integer valueFunctionDivide) {
		this.valueFunctionDivide = valueFunctionDivide;
	}

	public Integer getValueFunctionMultiply() {
		return valueFunctionMultiply;
	}

	public void setValueFunctionMultiply(Integer valueFunctionMultiply) {
		this.valueFunctionMultiply = valueFunctionMultiply;
	}

}
