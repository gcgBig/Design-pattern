package chapter1;

/**
 * 加法
 * @author DN
 *
 */
class addOpertion extends NewOpertion {

	public double getResult() {
		return getNum1() + getNum2();
	}
	
}

/**
 * 减法
 * @author DN
 *
 */
class subtractionOpertion extends NewOpertion {
	
	public double getResult() {
		return getNum1() - getNum2();
	}
	
}

/**
 * 乘法
 * @author DN
 *
 */
class multiplicationOpertion extends NewOpertion {
	
	public double getResult() {
		return getNum1() * getNum2();
	}
	
}

/**
 * 除法
 * @author DN
 *
 */
class divisionOpertion extends NewOpertion {
	
	public double getResult() {
		return getNum1() / getNum2();
	}
	
}
