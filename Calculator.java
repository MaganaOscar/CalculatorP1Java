package calculatorOne;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;
	
	public Calculator() {
	}
	
	public void performOperation() {
		if (operation.contains("+")) {
			results = operandOne + operandTwo;
		} else if (operation.contains("-")) {
			results = operandOne - operandTwo;
		}
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResults() {
		return results;
	}

	public void setResults(double results) {
		this.results = results;
	}
}
