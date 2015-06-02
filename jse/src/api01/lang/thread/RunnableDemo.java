package api01.lang.thread;

public class RunnableDemo {
	public static void main(String[] args) {
		
	}
}
class RunnableImpl implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(
					Thread.currentThread().getName()
					);
			/*
			 * 상속이 아니기 때문에 super 를 사용할 수 없다.
			 */
		}
	}
}