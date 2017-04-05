package chapter5;

/**
 * 大学生雷锋
 * @author DN
 *
 */
public class StudentLeiFeng implements LeifengFactory {

	@Override
	public Student createLeiFeng() {
		return new Student();
	}

}
