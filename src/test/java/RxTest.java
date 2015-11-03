import rx.Observable;
import rx.Subscriber;

/**
 * @author Michal Brewczak
 */
public class RxTest {
	public static void main(String[] args) {
		String str = "sty";
		getDoubledString(str).subscribe(new Subscriber<Integer>() {
			@Override
			public void onCompleted() {
				System.out.println("on complete");
			}

			@Override
			public void onError(Throwable throwable) {
				System.out.println("error");
			}

			@Override
			public void onNext(Integer i) {
				System.out.println("on next: " + i);
			}
		});
	}

	public static Observable<Integer> getDoubledString(String str) {
		return Observable.create(new Observable.OnSubscribe<Integer>() {
			@Override
			public void call(Subscriber<? super Integer> subscriber) {
				subscriber.onNext(Integer.parseInt(str));
			}
		});
	}
}
