package com.amit.expression.model;

public class Number implements Expression {
	
	private int number;
	
	public Number(int number) {
		super();
		this.number = number;
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return number;
	}

	
	
}
