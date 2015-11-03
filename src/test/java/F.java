import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

/**
 * @author Michal Brewczak
 */
public class F {
	public static void main(String[] args) {
		System.out.println("Start on " + Thread.currentThread().getId());
		Observable.create(new Observable.OnSubscribe<Integer>() {
			@Override
			public void call(Subscriber<? super Integer> o) {
				System.out.println("Created on " + Thread.currentThread().getId());
				o.onNext(1);
				o.onNext(2);
				o.onCompleted();
			}
		}).subscribeOn(Schedulers.newThread())
				.subscribe(new Subscriber<Integer>() {
					@Override
					public void onCompleted() {
						System.out.println("Completed on " + Thread.currentThread().getId());
					}

					@Override
					public void onError(Throwable throwable) {

					}

					@Override
					public void onNext(Integer o) {
						System.out.println("on next on " + Thread.currentThread().getId());
					}
				});
		System.out.println("STOP on " + Thread.currentThread().getId());
	}
}
