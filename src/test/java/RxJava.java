import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Michal Brewczak
 */
public class RxJava {
	private ExecutorService executorService;

	public RxJava() {
		this.executorService = Executors.newSingleThreadExecutor();
	}

	private void testRx() {
		getShots().observeOn(Schedulers.from(this.executorService))
				.subscribeOn(Schedulers.from(this.executorService))
				.doOnCompleted(() -> System.out.println("end of items"))
				.flatMap(Observable::from)
				.forEach(shot -> {
					switch (shot) {
						case 0:
							System.out.println("just 0");
							break;
						case 1:
							System.out.println("just 1");
							break;
						default:
							System.out.println("more than 1");
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				});
	}

	public Observable<List<Integer>> getShots() {
		List<Integer> shots = Arrays.asList(0, 2, 1, 3, 0, 1);
		return Observable.just(shots);
	}

	public static void main(String[] args) {
		new RxJava().testRx();
	}
}
