class CalculateOperation {
	char c;
	public calculate() {
		if(c == '+')
			System.out.println("Add");
		else if(c == '-')
			System.out.println("Subtraction");	
	}

}



interface Operation {
	public void calculate();
}

class CalculateOperation {
	//Use Addition class for addition. Similarly, other classes
	
}

class Addition implements Operation {
	public void calculate() {
		System.out.println("Add");	
	}
}

class Subtraction implements Operation {
	public void calculate() {
		System.out.println("Subtraction");	
	}
}

class Mutliplication implements Operation {
	public void calculate() {
		System.out.println("Multiplication");	
	}
}
