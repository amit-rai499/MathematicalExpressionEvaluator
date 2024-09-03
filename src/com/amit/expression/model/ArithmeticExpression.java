package com.amit.expression.model;

public class ArithmeticExpression implements Expression {

	private Expression leftExpression;
	
	private Expression rightExpression;
	
	private Operator operator;
	
	
	public ArithmeticExpression(Expression leftExpression, Expression rightExpression, Operator operator) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
		this.operator = operator;
	}

	@Override
	public int evaluate() {
		switch (operator) {
		case ADD:
			return leftExpression.evaluate()+rightExpression.evaluate();
		case SUBTRACT:
			return leftExpression.evaluate()-rightExpression.evaluate();
		case MULTIPLY:
			return leftExpression.evaluate()*rightExpression.evaluate();
		case DIVIDE:
			return leftExpression.evaluate()/rightExpression.evaluate();
		default:
			return 0;
		}
	}

}
