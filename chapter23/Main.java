package chapter23;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 * @author gcg
 * 
 * 2017年4月12日 下午3:41:50
 */
public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		List<AbstractExpression> lists = new ArrayList<AbstractExpression>();
		lists.add(new TerminalExpression());
		lists.add(new TerminalExpression());
		lists.add(new NonTerminalExpression());
		lists.add(new TerminalExpression());
		
		for (AbstractExpression abstractExpression : lists) {
			abstractExpression.interpret(context);
		}
	}
	
}
