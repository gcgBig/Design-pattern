package chapter10;

/**
 * 具体通知者
 * @author DN
 *
 */
public class ConcreteSubject extends Subject {

	// 被观察者状态
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
}
