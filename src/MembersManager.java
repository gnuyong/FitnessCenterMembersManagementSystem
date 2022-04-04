import java.util.Scanner;

public class MembersManager {
	Members members;
	Scanner input;
	
	MembersManager(Scanner input){
		this.input = input;
	}
	
	public void AddMembers(){
		members = new Members();
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
		members.id = input.nextInt();
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� �̸��� �Է��ϼ���: ");
		members.name = input.next();				
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��ȭ��ȣ�� �Է��ϼ���: ");
		members.phone = input.nextInt();
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� PT������ �̸��� �Է��ϼ���: ");
		members.pt = input.next();			
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ��� ���� ���� �Է��ϼ���: ");
		members.registration = input.nextInt();			
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���� �繰�� ��ȣ�� �Է��ϼ���: ");
		members.locker = input.nextInt();
	}
	public void DeleteMembers() {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
		int memberId = input.nextInt();
		if (members == null) {
			System.out.println("��ϵ��� ���� ȸ���Դϴ�.");
			return;
		}
		if (members.id == memberId) {
			members = null;
			System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�.");
		}
	}
	public void EditMembers() {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
		int memberId = input.nextInt();
		if (members.id == memberId) {
			System.out.println(memberId+" ȸ���� �����Ǿ����ϴ�.");
		}
	}
	public void ViewMembers() {
		System.out.print("��Ʈ�Ͻ� ���� ȸ���� ���̵� �Է��ϼ���: ");
		int memberId = input.nextInt();
		if (members.id == memberId) {
			members.printInfo();
		}
	}

}
