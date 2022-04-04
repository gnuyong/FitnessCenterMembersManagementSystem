
public class Members {
	int id;
	String name;
	int phone;
	String pt;
	int registration;
	int locker;
	
	public Members() {
	}
	
	public Members(int id, String name, int phone, String pt, int registration, int locker) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.pt = pt;
		this.registration = registration;
		this.locker = locker;
	}
	
	public void printInfo() {
		System.out.println("회원 ID: "+ this.id + " 회원 이름: " + this.name + " 회원의 전화번호:  " + this.phone );
		System.out.println("회원 PT선생님 이름: " + this.pt + " 회원 등록 개월 수: " + this.registration + " 회원 사물함 번호: " + this.locker);
	}
	
}
