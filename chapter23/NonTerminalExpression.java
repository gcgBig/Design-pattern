package chapter23;

/**
 * 非终端解释器，解释非终端符号
 * @author gcg
 * 
 * 2017年4月12日 下午3:39:22
 */
public class NonTerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("非终端解释器");
	}

}
