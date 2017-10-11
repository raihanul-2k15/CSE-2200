
public class Calculator {
	private enum CalcState {
		OPERAND, OPERATOR;
	}
	CalcState state;
	private float result;
	private float buffer;
	char operator;
	public Calculator() {
		AC();
	}
	public void EnterNumber(float num) {
		buffer=num;
		performOperation();
		System.out.println(result);
	}
	public void EnterOperator(char op) {
		operator=op;
	}
	public void EnterEquals() {
		if (state==CalcState.OPERATOR) {
			performOperation();
		}
		float temp=result;
		AC();
		System.out.println(temp);
		
	}
	public void AC() {
		state=CalcState.OPERAND;
		result=0;
		buffer=0;
		operator='+';
	}
	private void performOperation() {
		if (operator=='+') {
			result+=buffer;
		} else if (operator=='-') {
			result-=buffer;
		} else if (operator=='*') {
			result*=buffer;
		} else if (operator=='/') {
			result/=buffer;
		}
		return;
	}
}