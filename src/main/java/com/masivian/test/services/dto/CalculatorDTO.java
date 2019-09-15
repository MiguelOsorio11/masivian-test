package com.masivian.test.services.dto;

import java.io.Serializable;

/**
 * 
 * @author Miguel Osorio
 *
 */
public class CalculatorDTO implements Serializable {

	private static final long serialVersionUID = 756646273171885092L;

	private Long id;

	private Integer valueFunctionAdd;

	private Integer valueFunctionSubstract;

	private Integer valueFunctionDivide;

	private Integer valueFunctionMultiply;

	public CalculatorDTO() {

	}

	public CalculatorDTO(Integer valueFunctionAdd, Integer valueFunctionSubstract, Integer valueFunctionDivide,
			Integer valueFunctionMultiply) {
		this.valueFunctionAdd = valueFunctionAdd;
		this.valueFunctionSubstract = valueFunctionSubstract;
		this.valueFunctionDivide = valueFunctionDivide;
		this.valueFunctionMultiply = valueFunctionMultiply;
	}

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
