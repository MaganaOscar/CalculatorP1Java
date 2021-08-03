package calculatorOne;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator tester = new Calculator();
		tester.setOperandOne(10.5);
		tester.setOperation("+");
		tester.setOperandTwo(5.2);
		tester.performOperation();
		System.out.println(tester.getResults());
	}

}
