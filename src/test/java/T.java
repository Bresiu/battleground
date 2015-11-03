import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * @author Michal Brewczak
 */
public class T {
	public static void main(String[] args) {
		System.out.println("Main: " + Thread.currentThread().getId());

		Integer[] items = {0, 1, 2, 3, 4, 5};

		Observable.from(items)
				.subscribeOn(Schedulers.computation())
				.filter(integer -> integer % 2 == 0)
				.observeOn(Schedulers.newThread())
				.subscribe(i -> {
					System.out.println("Received " + i + " on " + Thread.currentThread().getId());
				});

		System.out.println("Finished main: " + Thread.currentThread().getId());

	}
}
