
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
		System.out.println("ȸ�� ID: "+ this.id + " ȸ�� �̸�: " + this.name + " ȸ���� ��ȭ��ȣ:  " + this.phone );
		System.out.println("ȸ�� PT������ �̸�: " + this.pt + " ȸ�� ��� ���� ��: " + this.registration + " ȸ�� �繰�� ��ȣ: " + this.locker);
	}
	
}
