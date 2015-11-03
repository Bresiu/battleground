import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * @author Michal Brewczak
 */
public class Test {
	static Observable<String> query() {
		System.out.println("producing");
		return Observable.just("TEST");
	}

	public static void main(String[] args) throws InterruptedException {
		new Test().start();
	}

	private void start() {
		A a = new A();
		a.start();
		a.subscrbe(query());
		B b = new B();
		b.start();
		b.subscrbe(query());

		while (true) {
			query();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("running");
		}
	}

	private class A extends Thread{
		private void subscrbe(Observable<String> o) {
			o.doOnNext(s -> System.out.println("A " + s))
					.subscribeOn(Schedulers.io())
					.subscribe(s -> System.out.println("A subcribed"));
		}
	}

	private class B extends Thread {
		private void subscrbe(Observable<String> o) {
			o.doOnNext(s -> System.out.println("B " + s))
					.subscribeOn(Schedulers.io())
					.subscribe(s -> System.out.println("B subcribed"));
		}
	}
}
