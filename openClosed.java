class Calculate {
	public void calculateSum(int []sumArray) {
		if(sumArray.length == 2) {
			System.out.println(sumArray[0] + sumArray[1]);
		}
		else if(sumArray.length == 3) {
			System.out.println(sumArray[0] + sumArray[1] + sumArray[2]);
		}
	}	

}

//if length of sumArray increases then: ??

class Calculate {
	public void calculateSum(int []sumArray) {
		int sum = 0;
		for(int i = 0 ; i < sumArray.length ; i++) {
			sum += sumArray[i];
		}
		System.out.println(sum);
	}

}
