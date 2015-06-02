package api01.lang.thread;

public class BankSyncDemo {
	public static void main(String[] args) {
		// 사용자 정의 타입의 배열을 생성하는 방법은 아래와 같다.
		Customer[] customers = new Customer[3];
		customers[0] = new Customer(new Account("홍길동"), "강남점", 100);
		customers[0].start();
		customers[1] = new Customer(new Account("김길동"), "종로점", 100);
		customers[1].start();
		customers[2] = new Customer(new Account("문길동"), "마포점", 100);
		customers[2].start();
		customers[0] = new Customer(new Account("가산점"), "마포점", 100);
		customers[0].start();
		
	}
}
class Account{
	String name;
	int total;
	/*
	 * 코딩습관 : 생성자를 생성시킬 때는
	 * 무조건 필드를 선언 후 바로 CTRL + Space Enter
	 */
	/*
	 * 생성자 오버로딩을 하려고 할때는
	 * 자동생성 시킨 생성자에다 this("") 이런식으로
	 * String 이면"", int 면0, 객체면 null 을 주면 된다.
	 */
	public Account(){
	}
	public Account(String string) {
		this.name = string;
	}
	/*
	 * 파라미터값 int money : 입출금
	 * 파라미터값 String location : 지점
	 */
	public Account(int money, String location) {
		total += money;
		try {
			Thread.sleep(1000);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(
					"["+"location"+"]"+ "money"+" 원 입금함 /"
					+ "총액 : "+"total"+" 원");
		}
	}
	public void deposit(int money, String name2) {
		
	}
}
class Customer extends Thread{
	Account account; // 사용자정의 객체를 필드의 인스턴스 변수로 선언함.
	int money;
	public Customer(Account account, String str, int money) {
		super(str);	// super 를 사용하려면 가장 먼저 호출해야함.
		// this.accout = object; 해도 에러는 나지 않는다. 다만 가독성차이
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		account.deposit(money, this.getName());
	}
}










