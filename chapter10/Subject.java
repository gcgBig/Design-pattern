package chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知者
 * @author DN
 *
 */
public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	// 添加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	// 删除观察者
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	// 通知所有观察者
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}
