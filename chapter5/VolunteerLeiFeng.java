package chapter5;

/**
 * 志愿者雷锋
 * @author DN
 *
 */
public class VolunteerLeiFeng implements LeifengFactory {

	@Override
	public Volunteen createLeiFeng() {
		return new Volunteen();
	}

}
