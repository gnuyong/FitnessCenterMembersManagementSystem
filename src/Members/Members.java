package Members;

import java.util.Scanner;

public abstract class Members {
	protected MembersKind kind = MembersKind.Beginner; 
	protected int id;
	protected String name;
	protected int phone;
	protected String pt;
	protected int registration;
	protected int locker;
	
	public Members() {
	}
	
	public Members(MembersKind kind) {
		this.kind = kind;
	}
	
	public Members(int id, String name, int phone, String pt, int registration, int locker) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.pt = pt;
		this.registration = registration;
		this.locker = locker;
	}
	
	public Members(MembersKind kind,int id, String name, int phone, String pt, int registration, int locker) {
		this.kind = kind;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.pt = pt;
		this.registration = registration;
		this.locker = locker;
	}
	
	public MembersKind getKind() {
		return kind;
	}

	public void setKind(MembersKind kind) {
		this.kind = kind;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPt() {
		return pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getLocker() {
		return locker;
	}

	public void setLocker(int locker) {
		this.locker = locker;
	}

	public abstract void printInfo();
	
	public void getUserInput(Scanner input) {
		System.out.print("휘트니스 센터 회원의 아이디를 입력하세요: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("휘트니스 센터 회원의 이름을 입력하세요: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("휘트니스 센터 회원의 전화번호를 입력하세요: ");
		int phone = input.nextInt();
		this.setPhone(phone);
		
		System.out.print("휘트니스 센터 회원의 담당 PT선생님 이름을 입력하세요: ");
	    String pt = input.next();			
		this.setPt(pt);
		
	    System.out.print("휘트니스 센터 회원의 등록 개월 수를 입력하세요: ");
		int registration = input.nextInt();			
		this.setRegistration(registration);
		
		System.out.print("휘트니스 센터 회원의 개인 사물함 번호를 입력하세요: ");
		int locker = input.nextInt();
		this.setLocker(locker);
	}
}
