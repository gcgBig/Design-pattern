package chapter23;

/**
 * 终端解释器类，关于终结符的操作
 * @author gcg
 * 
 * 2017年4月12日 下午3:37:36
 */
public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("终端解释器");
	}

}
