package com.amit.expression.application;

import com.amit.expression.model.ArithmeticExpression;
import com.amit.expression.model.Expression;
import com.amit.expression.model.Number;
import com.amit.expression.model.Operator;

public class Calculator {
	
	public static void main(String[] args) {
		/* To solve 2+3*5, we can break down this expression as shown below. It will form tree like structure which is the format for Composite
		 * design pattern to be used.
		 *      		  +								+
		 *  2+3*5 -->   /   \         -->    		  /   \
		 *   		   2    3*5						 2     *
		 * 										   /   \
		 * 										  3     5 
		 */
		
		Expression number2 = new Number(2);
		Expression number3 = new Number(3);
		Expression number5 = new Number(5);
		
		Expression expression1 = new ArithmeticExpression(number3, number5, Operator.MULTIPLY);
		Expression expression2 = new ArithmeticExpression(number2, expression1, Operator.ADD);
		
		System.out.println(expression2.evaluate());
	}

}
